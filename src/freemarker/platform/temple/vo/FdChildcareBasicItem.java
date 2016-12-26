package freemarker.platform.temple.vo;

import java.sql.Timestamp;

/**
 * 儿保套餐基础项目
 * FdChildcareBasicItem entity. @author MyEclipse Persistence Tools
 */

public class FdChildcareBasicItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String itemName;
	private String isEnable;
	private String remark;
	private Timestamp createTime;
	private String bussinessType;
	// Constructors

	/** default constructor */
	public FdChildcareBasicItem() {
	}

	public String getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}

	/** full constructor */
	public FdChildcareBasicItem(String itemName, String isEnable,
			String remark, Timestamp createTime) {
		this.itemName = itemName;
		this.isEnable = isEnable;
		this.remark = remark;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}