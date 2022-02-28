import java.util.ArrayList;
	
public class FoodSet
{
	
	private String appet, soup, refresh, mainCourse, dessert;
	private String appetDesc, soupDesc, refreshDesc, mainCourseDesc, dessertDesc;
	private ArrayList <String> food_list;
	
	public FoodSet(String appet, String soup, String refresh, String mainC, String dessert, String appetDesc, String soupDesc,
			String refreshDesc, String mainCourseDesc, String dessertDesc) 
	{
		this.appet = appet;
		this.soup = soup;
		this.refresh = refresh;
		this.mainCourse = mainC;
		this.dessert = dessert;
		this.appetDesc = appetDesc;
		this.soupDesc = soupDesc; 
		this.refreshDesc = refreshDesc;
		this.mainCourseDesc = mainCourseDesc;
		this.dessertDesc = dessertDesc;
		this.dessert = dessert;	
	}

	public String getAppet() 
	{
		return appet;
	}
	

	public String getSoup() 
	{
		return soup;
	}
	
	public String getRefresh() 
	{
		return refresh;
	}
	
	public String getMainCourse() 
	{
		return mainCourse;
	}
	
	public String  getDessert() 
	{
		return dessert;
	}
	

	public void setAppet(String ap) 
	{
		this.appet = ap;
	}
	
	public void setSoup(String sp) 
	{
		this.soup = sp;
	}
	
	public void setRefresh(String re) 
	{
		this.refresh = re;
	}
	
	public void setMainCourse(String m) 
	{
		this.mainCourse = m;
	}
	
	public void setDessert(String d) 
	{
		this.dessert = d;
	}

	public String getRefreshDesc() 
	{
		return refreshDesc;
	}

	public void setRefreshDesc(String refreshDesc) 
	{
		this.refreshDesc = refreshDesc;
	}

	public String getAppetDesc() 
	{
		return appetDesc;
	}

	public void setAppetDesc(String appetDesc) 
	{
		this.appetDesc = appetDesc;
	}

	public String getSoupDesc() 
	{
		return soupDesc;
	}

	public void setSoupDesc(String soupDesc) 
	{
		this.soupDesc = soupDesc;
	}

	public String getMainCourseDesc() 
	{
		return mainCourseDesc;
	}

	public void setMainCourseDesc(String mainCourseDesc) 
	{
		this.mainCourseDesc = mainCourseDesc;
	}

	public String getDessertDesc() {
		return dessertDesc;
	}

	public void setDessertDesc(String dessertDesc) {
		this.dessertDesc = dessertDesc;
	}
	
	
	public void displayMenu() {}
	
	public void readFood() {}
}

