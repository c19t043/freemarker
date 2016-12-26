package freemarker.platform.temple.vo;

/**
 * FdServiceTimesDetail entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class FdServiceTimesDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private FdServiceTimes fdServiceTimes;
	private String timeDetailName;
	private String effectiveTime;
	private String servicePrice;
	private String remark;
	private String isEnable;
	private String effectiveTimeShow;
	private Long sort;

	// Constructors

	/** default constructor */
	public FdServiceTimesDetail() {
	}


	// Property accessors

	public Long getId() {
		return this.id;
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


	public String getTimeDetailName() {
		return this.timeDetailName;
	}

	public void setTimeDetailName(String timeDetailName) {
		this.timeDetailName = timeDetailName;
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getEffectiveTimeShow() {
		return this.effectiveTimeShow;
	}

	public void setEffectiveTimeShow(String effectiveTimeShow) {
		this.effectiveTimeShow = effectiveTimeShow;
	}

	public Long getSort() {
		return this.sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

}