package freemarker.platform.temple.vo;

import java.sql.Timestamp;
import java.util.List;

/**
 * 家庭医生儿保项目配置头信息
 * FdChildcareProjMain entity. @author MyEclipse Persistence Tools
 */

public class FdChildcareProjMain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private FdServiceTimes fdServiceTimes;
	private String showName;
	private Timestamp createTime;
	
	private List<FdChildcareBasicItem> fdChildcareBasicItems;
	// Constructors

	/** default constructor */
	public FdChildcareProjMain() {
	}

	/** full constructor */
	public FdChildcareProjMain(Long fdServiceTimesId, String showName,
			Timestamp createTime) {
		this.showName = showName;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}


	public List<FdChildcareBasicItem> getFdChildcareBasicItems() {
		return fdChildcareBasicItems;
	}

	public void setFdChildcareBasicItems(
			List<FdChildcareBasicItem> fdChildcareBasicItems) {
		this.fdChildcareBasicItems = fdChildcareBasicItems;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FdServiceTimes getFdServiceTimes() {
		return fdServiceTimes;
	}

	public void setFdServiceTimes(FdServiceTimes fdServiceTimes) {
		this.fdServiceTimes = fdServiceTimes;
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}