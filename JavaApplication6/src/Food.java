import java.util.ArrayList;

public class Food{
	private String appet, soup, refresh, mainF, dessert;
	private ArrayList <String> food_list;
	
	public Food(String appet, String soup, String refresh, String mainF, String dessert) {
		this.appet = appet;
		this.soup = soup;
		this.refresh = refresh;
		this.mainF = mainF;
		this.dessert = dessert;
	}

	public String getAppet() {
		return appet;
	}
	public String getSoup() {
		return soup;
	}
	public String getRefresh() {
		return refresh;
	}
	public String getMainF() {
		return mainF;
	}
	public String  getDessert() {
		return dessert;
	}
	
	public void setAppet(String ap) {
		this.appet = ap;
	}
	public void setSoup(String sp) {
		this.soup = sp;
	}
	public void setRefresh(String re) {
		this.refresh = re;
	}
	public void setMainF(String m) {
		this.mainF = m;
	}
	public void setDessert(String d) {
		this.dessert = d;
	}
	
	public void displayMenu() {}
	
	public void readFood() {}

}

