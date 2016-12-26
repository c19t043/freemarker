package freemarker.platform.temple.vo;


/**
 * FdPlatformMemberRelUser entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class FdPlatformMemberRelUser implements java.io.Serializable {

	// Fields

	private Long id;
	private KyUserInfo userInfo;
	private FdFamilyMember familyMember;

	// Constructors

	/** default constructor */
	public FdPlatformMemberRelUser() {
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KyUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(KyUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public FdFamilyMember getFamilyMember() {
		return familyMember;
	}

	public void setFamilyMember(FdFamilyMember familyMember) {
		this.familyMember = familyMember;
	}
}