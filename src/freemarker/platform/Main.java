package freemarker.platform;

import java.beans.IntrospectionException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.platform.temple.vo.FdServiceTimesDetail;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Main {
	
	//模板文件路径
	private final static  String filePath = "F:/my/workspace/myeclipse/freemarker/src/freemarker/platform/temple";
	//生成文件路径
	private final static  String generatePath = "F:/my/workspace/myeclipse/freemarker/src/freemarker/platform/temple/generate";
	
	public static void main(String[] args) throws Exception {
		System.out.println("生成开始============================");
		//===========================需要生成的对象
		Class<?> clazz = FdServiceTimesDetail.class;
		//===========================
		
		Main main = new Main();
		Configuration cfg = main.setConfiguration();

		Map<String, Object> root = main.setMap(clazz);
		List<String> fileNames = main.getFileNames();
		Writer writer = null;
		for (String fileName : fileNames) {
			//转换文件名成要生成的文件名
			String tmp_filename = main.convertFileName(fileName,clazz);
			//获取对应模板
			Template temp = cfg.getTemplate(fileName);
			//生成文件
			File file = new File(generatePath+"/"+tmp_filename);
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			OutputStream out = new FileOutputStream(file);
			writer = new OutputStreamWriter(out);
			temp.process(root, writer);
		}
		writer.close();
		System.out.println("生成完毕============================");
    }
	/**
	 * 转换文件名
	 * @param fileName
	 * @return
	 */
	private String convertFileName(String fileName,Class<?> clazz){
		String simpleName = clazz.getSimpleName();
		String varName = this.firstLetterToLower(simpleName);
		String tmp_filename = "";
		if(fileName.endsWith("java.ftp")){
			tmp_filename = simpleName+fileName.replaceFirst("java.ftp", ".java");
		}
		else if(fileName.endsWith("xml.ftp")){
			tmp_filename = varName+"-"+fileName.replaceFirst("xml.ftp", ".xml");
		}
		else if(fileName.endsWith("jsp.ftp")){
			tmp_filename = varName+"_"+fileName.replaceFirst("jsp.ftp", ".jsp");
			//continue;
		}
		return tmp_filename;
	}
	private  List<String> getFileNames(){
		List<String> fileList = new ArrayList<String>();
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		for (File tmp_file : listFiles) {
			if(tmp_file.isFile()){
				fileList.add(tmp_file.getName());
			}
		}
		return fileList;
	}
	/**
	 * 
	 * @param clazz 生成对应文件需要的类
	 * @param variableName 类定义使用的变量名
	 * @return
	 */
	private Map<String,Object> convertMapWithClass(Class<?> clazz) throws IntrospectionException{
		Map<String,Object> map  = new HashMap<String,Object>();
		//首字母小写
		String variableName = firstLetterToLower(clazz.getSimpleName());
		//包全名
		map.put("packageAllName", clazz.getName());
		//包名
		map.put("packageName", clazz.getPackage().getName());
		//类名
		map.put("className", clazz.getSimpleName());
		//变量名
		map.put("varName", variableName);
		//所有定义的属性
		Field[] fields = clazz.getDeclaredFields();
		List<String> jspNameProperty = new ArrayList<String>();
		List<String> jsplistNameProperty = new ArrayList<String>();
		for (Field field : fields) {
			jspNameProperty.add(variableName+"."+field.getName());
			jsplistNameProperty.add(field.getName());
		}
		map.put("jsp", jspNameProperty);
		map.put("jsplist", jsplistNameProperty);
/*		//声明的所有get方法
		Method[] declaredMethods = clazz.getDeclaredMethods();
		List<String> getMethods = new ArrayList<String>();
		for (Method method : declaredMethods) {
			getMethods.add(variableName+"."+method.getName());
		}
		map.put("getMethods", getMethods);*/
		return map;
	}
	/**
	 * 首字母小写
	 * @param str
	 * @return
	 */
	private String firstLetterToLower(String str){
		String tmp = str.substring(0,1);
		return str.replaceFirst(tmp, tmp.toLowerCase());
	}
	private Map<String,Object> setMap(Class<?> clazz) throws IntrospectionException{
		/*       
	    Map<String,Object> root = new HashMap<String,Object>();
        root.put("user", "Big Joe");
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
        root.put("latestProduct", latest);*/
        Map<String, Object> root = convertMapWithClass(clazz);
        return root;
	}
	
	private  Configuration setConfiguration() throws IOException{
		//设置freemarker版本
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
        //模板加载路径
        cfg.setDirectoryForTemplateLoading(new File(filePath));
        //设置默认编码
        cfg.setDefaultEncoding("UTF-8");
        //设置异常处理
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        //设置异常处理
        cfg.setLogTemplateExceptions(false);
        return cfg;
	}
}
