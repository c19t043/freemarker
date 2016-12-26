package freemarker.platform.temple.vo;

/**
 * FdFamilyMemberTag entity. @author MyEclipse Persistence Tools
 */

public class FdFamilyMemberTag implements java.io.Serializable {

	// Fields

	private Long id;
	private String tagName;
	private String isEnable;

	// Constructors

	/** default constructor */
	public FdFamilyMemberTag() {
	}

	/** full constructor */
	public FdFamilyMemberTag(String tagName, String isEnable) {
		this.tagName = tagName;
		this.isEnable = isEnable;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

}