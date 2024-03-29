
public class Contact3 {

	//a class has two types of members i)data members ii)member methods
	
	private int contactId;
	private String firstName;
	private long mobileNo;
	private String email;
	private String company;
	
	
	//how to make objects method ready-->by using constructors
	
public Contact3() {
		
	}
	
	public Contact3(int contactId, String firstName, long mobileNo, String email, String company) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.company = company;
	}
	
	//mutators or accessor methods or set/get methods
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Contact3 [contactId=" + contactId + ", firstName=" + firstName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", company=" + company + "]";
	}

	
	
}
