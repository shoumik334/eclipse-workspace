package publicTransport;

public class BookingClass {
	private String name;
	private String email;
	private String address;
	private String mobile;
	
	
	
	public BookingClass(){
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public BookingClass(String name, String email, String address, String mobile){
		
		setName(name);
		setEmail(email);
		setAddress(address);
		setMobile(mobile);
	}
	
}
