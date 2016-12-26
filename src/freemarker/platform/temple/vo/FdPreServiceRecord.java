package freemarker.platform.temple.vo;

import java.sql.Timestamp;
import java.util.List;

/**
 * 家庭医生电话预约记录
 * FdPreServiceRecord entity. @author MyEclipse Persistence Tools
 */

public class FdPreServiceRecord implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String serviceItem;
	private String remark;
	private String status;
	private String operateTime;
	private String preServiceTime;
	private String createPerson;
	private Timestamp createTime;
	private String modifyPerson;
	private Timestamp modifyTime;
	private List<FdChildcareBasicItem> fdChildcareBasicItems;
	
	// Constructors

	/** default constructor */
	public FdPreServiceRecord() {
	}

	public List<FdChildcareBasicItem> getFdChildcareBasicItems() {
		return fdChildcareBasicItems;
	}

	public void setFdChildcareBasicItems(
			List<FdChildcareBasicItem> fdChildcareBasicItems) {
		this.fdChildcareBasicItems = fdChildcareBasicItems;
	}

	/** full constructor */
	public FdPreServiceRecord(String serviceItem, String remark, String status,
			String operateTime, Long operatorId, Long fdServiceOrderId,
			String preServiceTime, String createPerson, Timestamp createTime,
			String modifyPerson, Timestamp modifyTime) {
		this.serviceItem = serviceItem;
		this.remark = remark;
		this.status = status;
		this.operateTime = operateTime;
		this.preServiceTime = preServiceTime;
		this.createPerson = createPerson;
		this.createTime = createTime;
		this.modifyPerson = modifyPerson;
		this.modifyTime = modifyTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceItem() {
		return this.serviceItem;
	}

	public void setServiceItem(String serviceItem) {
		this.serviceItem = serviceItem;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}


	public String getPreServiceTime() {
		return this.preServiceTime;
	}

	public void setPreServiceTime(String preServiceTime) {
		this.preServiceTime = preServiceTime;
	}

	public String getCreatePerson() {
		return this.createPerson;
	}

	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getModifyPerson() {
		return this.modifyPerson;
	}

	public void setModifyPerson(String modifyPerson) {
		this.modifyPerson = modifyPerson;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}