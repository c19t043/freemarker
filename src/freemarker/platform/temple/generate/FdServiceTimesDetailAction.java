package freemarker.platform.temple.vo;

import java.util.List;

import freemarker.platform.temple.vo.FdServiceTimesDetail;
import com.java.ec.common.PageSortModel;
import freemarker.platform.temple.vo.FdServiceTimesDetailService;
import com.java.platform.core.Action;

@SuppressWarnings("serial")
public class FdServiceTimesDetailAction extends Action  {
	private FdServiceTimesDetailService fdServiceTimesDetailService;
	private FdServiceTimesDetail fdServiceTimesDetail;
	private String action;
	
	@Override
	public String execute() throws Exception {
		switch(action){
		//获取分页列表
		case "queryFdServiceTimesDetailByPage":
			queryFdServiceTimesDetailByPage();return "list";
		//添加or保存
		case "saveOrUpdateFdServiceTimesDetail":
			saveOrUpdateFdServiceTimesDetail();return redirectActionResult("list");
		//跳转到添加or编辑页面
		case "toAddOrUpdatePage":
			toAddOrUpdatePage();return "toAddOrUpdate";
		}
		return SUCCESS;
	}
	/**
	 * 获取分页列表
	 */
	private void queryFdServiceTimesDetailByPage(){
		PageSortModel model = new PageSortModel(getHttpServletRequest(), "list");
		List<FdServiceTimesDetail> fdServiceTimesDetailByPage = fdServiceTimesDetailService.getFdServiceTimesDetailByPagination(model, fdServiceTimesDetail);
		this.putToRequest("list", fdServiceTimesDetailByPage);
	}
	/**
	 * 跳转到添加or编辑页面
	 */
	private void toAddOrUpdatePage(){
		if(fdServiceTimesDetail!=null){
			Long id = fdServiceTimesDetail.getId();
			if(id!=null) {
				fdServiceTimesDetail = fdServiceTimesDetailService.get(id, FdServiceTimesDetail.class);
			}
		}
	}
	/**
	 * 添加or保存
	 */
	private void saveOrUpdateFdServiceTimesDetail(){
		fdServiceTimesDetailService.saveOrUpdateFdServiceTimesDetail(fdServiceTimesDetail);
	}
	
	
	
	
	//-----------------------------------------setter/getter
	public FdServiceTimesDetail getFdServiceTimesDetail() {
		return fdServiceTimesDetail;
	}
	public void setFdServiceTimesDetail(FdServiceTimesDetail fdServiceTimesDetail) {
		this.fdServiceTimesDetail = fdServiceTimesDetail;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setFdServiceTimesDetailService(
			FdServiceTimesDetailService fdServiceTimesDetailService) {
		this.fdServiceTimesDetailService = fdServiceTimesDetailService;
	}
}
