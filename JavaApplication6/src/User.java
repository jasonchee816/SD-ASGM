
public abstract class User {
	private String email;
	private String password;
	
	//getter&setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//constructor
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	//user function
	public String toString() {
		return(email+" "+password);
	}
	
	public void viewMenu() {}
	
	public void viewReservation() {};
	
	//get the email domain name
	public String get_email_domain(String email_input) {
		return "email.substring(email.indexOf(@)+1);";
	}
	
	//to determine is user or admin using get_email_domain
	public boolean check_email(String email) {
		return false;
	}
	//to check password&email in database
	public boolean check_Login(String email, String password) {
		return false;
	}
	
	public abstract void update_Reservation();
	public abstract void cancel_Reservation();
	public abstract void search_Reservation();





	
}
