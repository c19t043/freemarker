package freemarker.platform.temple.vo;

/**
 * FdPlatformServiceOrder entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class FdPlatformServiceOrder implements java.io.Serializable {

	// Fields

	private Long id;
	private Long memberId;
	private Long mainDoctorId;
	private String orderNum;
	private Long userId;
	private String submitTime;
	private Double totalPrice;
	private Double realPrice;
	private String updateTime;
	private String orderStatus;
	private String comments;
	private String payMethod;
	private Double useRemainBalance;
	private String remindInfo;
	private Long usePoints;
	private String serviceEndTime;

	// Constructors

	/** default constructor */
	public FdPlatformServiceOrder() {
	}

	/** full constructor */
	public FdPlatformServiceOrder(Long memberId, Long mainDoctorId,
			String orderNum, Long userId, String submitTime, Double totalPrice,
			Double realPrice, String updateTime, String orderStatus,
			String comments, String payMethod, Double useRemainBalance,
			String remindInfo, Long usePoints, String serviceEndTime) {
		this.memberId = memberId;
		this.mainDoctorId = mainDoctorId;
		this.orderNum = orderNum;
		this.userId = userId;
		this.submitTime = submitTime;
		this.totalPrice = totalPrice;
		this.realPrice = realPrice;
		this.updateTime = updateTime;
		this.orderStatus = orderStatus;
		this.comments = comments;
		this.payMethod = payMethod;
		this.useRemainBalance = useRemainBalance;
		this.remindInfo = remindInfo;
		this.usePoints = usePoints;
		this.serviceEndTime = serviceEndTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMainDoctorId() {
		return this.mainDoctorId;
	}

	public void setMainDoctorId(Long mainDoctorId) {
		this.mainDoctorId = mainDoctorId;
	}

	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getRealPrice() {
		return this.realPrice;
	}

	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public Double getUseRemainBalance() {
		return this.useRemainBalance;
	}

	public void setUseRemainBalance(Double useRemainBalance) {
		this.useRemainBalance = useRemainBalance;
	}

	public String getRemindInfo() {
		return this.remindInfo;
	}

	public void setRemindInfo(String remindInfo) {
		this.remindInfo = remindInfo;
	}

	public Long getUsePoints() {
		return this.usePoints;
	}

	public void setUsePoints(Long usePoints) {
		this.usePoints = usePoints;
	}

	public String getServiceEndTime() {
		return this.serviceEndTime;
	}

	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

}