package freemarker.platform.temple.vo;

/**
 * FdBlackList entity. @author MyEclipse Persistence Tools
 */

public class FdBlackList implements java.io.Serializable {

	// Fields

	private Long id;
	private String phone;
	private String name;
	private String remark;

	// Constructors

	/** default constructor */
	public FdBlackList() {
	}

	/** full constructor */
	public FdBlackList(String phone, String name, String remark) {
		this.phone = phone;
		this.name = name;
		this.remark = remark;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}