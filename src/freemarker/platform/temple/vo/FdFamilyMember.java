package freemarker.platform.temple.vo;


/**
 * FdFamilyMember entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class FdFamilyMember implements java.io.Serializable {

	// Fields

	private Long id;
	private String familyName;
	private String familySex;
	private String familyIdCard;
	private String familyAge;
	private String familyPhone;
	private String familyTag;
	
	// Constructors

	/** default constructor */
	public FdFamilyMember() {
	}
	// Property accessors

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilySex() {
		return this.familySex;
	}

	public void setFamilySex(String familySex) {
		this.familySex = familySex;
	}

	public String getFamilyIdCard() {
		return this.familyIdCard;
	}

	public void setFamilyIdCard(String familyIdCard) {
		this.familyIdCard = familyIdCard;
	}

	public String getFamilyAge() {
		return this.familyAge;
	}

	public void setFamilyAge(String familyAge) {
		this.familyAge = familyAge;
	}

	public String getFamilyPhone() {
		return this.familyPhone;
	}

	public void setFamilyPhone(String familyPhone) {
		this.familyPhone = familyPhone;
	}

	public String getFamilyTag() {
		return this.familyTag;
	}

	public void setFamilyTag(String familyTag) {
		this.familyTag = familyTag;
	}

}