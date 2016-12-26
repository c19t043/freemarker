package freemarker.platform.temple.vo;

import java.util.List;

import freemarker.platform.temple.vo.FdServiceTimesDetail;
import com.java.ec.common.PageSortModel;
import com.java.platform.user.service.Service;

public interface FdServiceTimesDetailService extends Service {
	/**
	 * 获取分页列表
	 * @param model
	 * @param fdServiceTimesDetail
	 * @return
	 */
	List<FdServiceTimesDetail> getFdServiceTimesDetailByPagination(PageSortModel model,FdServiceTimesDetail fdServiceTimesDetail);
	/**
	 * 添加or保存
	 * @param fdServiceTimesDetail
	 * @return
	 */
	FdServiceTimesDetail saveOrUpdateFdServiceTimesDetail(FdServiceTimesDetail fdServiceTimesDetail);
}
