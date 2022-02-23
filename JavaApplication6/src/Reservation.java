import java.time.*;

public class Reservation 
{
    private LocalDate date;
    private LocalTime time;
    private String custName;
    private String custPhone;
    private String remarks;
    private Cart order;
    private int numOfPax;
    
    public Reservation(LocalDate date, LocalTime time, String custName, String custPhone, String remarks, Cart order, int numOfPax)
    {
    	this.date = date;
    	this.time = time;
    	this.custName = custName;
    	this.custPhone = custPhone;
    	this.remarks = remarks;
    	this.order = order;
    	this.numOfPax = numOfPax;
    }

	public LocalDate getDate() 
	{
		return date;
	}

	public void setDate(LocalDate date) 
	{
		this.date = date;
	}

	public LocalTime getTime() 
	{
		return time;
	}

	public void setTime(LocalTime time) 
	{
		this.time = time;
	}

	public String getCustName() 
	{
		return custName;
	}

	public void setCustName(String custName) 
	{
		this.custName = custName;
	}

	public String getCustPhone() 
	{
		return custPhone;
	}

	public void setCustPhone(String custPhone) 
	{
		this.custPhone = custPhone;
	}

	public String getRemarks() 
	{
		return remarks;
	}

	public void setRemarks(String remarks) 
	{
		this.remarks = remarks;
	}

	public Cart getOrder() 
	{
		return order;
	}

	public void setOrder(Cart order) 
	{
		this.order = order;
	}

	public int getNumOfPax() 
	{
		return numOfPax;
	}

	public void setNumOfPax(int numOfPax) 
	{
		this.numOfPax = numOfPax;
	}
}
