package tcs;

public class encap1 {
	private String firstname;
	private String lastname;
	private String email;
	private long phonenumber;
	public void setFirstName(String fn) {
		firstname=fn;
	}
	public void setLastName(String ln) {
		lastname=ln;
	}
	public void setEmail(String e) {
		email=e;
	}
	public void setPhoneNumber(long pn) {
		phonenumber=pn;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	public static void main(String[] args) {
		encap1 e=new encap1();
		e.setFirstName("Keerthana");
		e.setLastName("Nagisetti");
		e.setEmail("nagisettikeerthana@gmail.com");
		e.setPhoneNumber(9618465299l);
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getEmail());
		System.out.println(e.getPhoneNumber());
	}

}
