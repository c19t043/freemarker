package freemarker.platform.temple.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import freemarker.platform.temple.vo.FdServiceTimesDetail;
import com.java.ec.common.PageSortModel;
import freemarker.platform.temple.vo.FdServiceTimesDetailService;
import com.java.platform.user.service.ServiceImpl;
import com.java.util.EncryptUtil;

public class FdServiceTimesDetailServiceImpl extends ServiceImpl implements FdServiceTimesDetailService{

	@Override
	public <T> List<T> findPageByCriteria(PageSortModel arg0, Object arg1,
			Map<String, ?> arg2) {
		return null;
	}
	@Override
	public List<FdServiceTimesDetail> getFdServiceTimesDetailByPagination(PageSortModel model,
			FdServiceTimesDetail fdServiceTimesDetail) {
		Map<String,Object> param = new HashMap<String,Object>();
		StringBuilder hql = new StringBuilder();
		hql.append("FROM FdServiceTimesDetail c where 1=1 ");
		if(fdServiceTimesDetail!=null){
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getid)){
				hql.append(" and c.id like :id");
				param.put("id", "%"+fdServiceTimesDetail.getid+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getfdServiceTimes)){
				hql.append(" and c.fdServiceTimes like :fdServiceTimes");
				param.put("fdServiceTimes", "%"+fdServiceTimesDetail.getfdServiceTimes+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.gettimeDetailName)){
				hql.append(" and c.timeDetailName like :timeDetailName");
				param.put("timeDetailName", "%"+fdServiceTimesDetail.gettimeDetailName+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.geteffectiveTime)){
				hql.append(" and c.effectiveTime like :effectiveTime");
				param.put("effectiveTime", "%"+fdServiceTimesDetail.geteffectiveTime+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getservicePrice)){
				hql.append(" and c.servicePrice like :servicePrice");
				param.put("servicePrice", "%"+fdServiceTimesDetail.getservicePrice+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getremark)){
				hql.append(" and c.remark like :remark");
				param.put("remark", "%"+fdServiceTimesDetail.getremark+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getisEnable)){
				hql.append(" and c.isEnable like :isEnable");
				param.put("isEnable", "%"+fdServiceTimesDetail.getisEnable+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.geteffectiveTimeShow)){
				hql.append(" and c.effectiveTimeShow like :effectiveTimeShow");
				param.put("effectiveTimeShow", "%"+fdServiceTimesDetail.geteffectiveTimeShow+"%");
			}
			if(StringUtils.isNotBlank(fdServiceTimesDetail.getsort)){
				hql.append(" and c.sort like :sort");
				param.put("sort", "%"+fdServiceTimesDetail.getsort+"%");
			}
		}
		hql.append(" order by c.id desc");
		List<FdServiceTimesDetail> list = (List<FdServiceTimesDetail>) super.listForEc(hql.toString(),model, param);
		return list;
	}
	@Override
	public FdServiceTimesDetail saveOrUpdateFdServiceTimesDetail(FdServiceTimesDetail fdServiceTimesDetail) {
		Long id = fdServiceTimesDetail.getId();
		if(id==null){
			super.add(fdServiceTimesDetail);
		}else{
			FdServiceTimesDetail qryObj = super.get(id, FdServiceTimesDetail.class);
			BeanUtils.copyProperties(fdServiceTimesDetail, qryObj, new String[]{"id"});
			super.edit(qryObj);
			return qryObj;
		}
		return fdServiceTimesDetail;
	}
}
