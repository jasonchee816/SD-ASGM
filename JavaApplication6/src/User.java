
public abstract class User {
	private String email;
	private String password;
	
	//constructor
	public User(String email, String password) 
	{
		this.email = email;
		this.password = password;
	}
	
	//getter&setter
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	//user function
	public String toString() 
	{
		return(email);
	}
	
	public void viewMenu() {}
	
	
	//get the email domain name
	public boolean isAdmin() 
	{
		if (this.email.substring(this.email.indexOf('@')+1) == "Cataloge.my")
			return true;
		else
			return false;
	}
	
	public abstract void viewReservation();
	public abstract void update_Reservation();
	public abstract void cancel_Reservation();
	public abstract void search_Reservation();


	
}
