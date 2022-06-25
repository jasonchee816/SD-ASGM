import java.util.Scanner;
import java.io.*;

public class FoodOrderingSystem 
{
	private static Scanner input = new Scanner(System.in);
	private static User user;
	
    public static void main(String[] args) throws IOException
    {
        LoginSystem login = new LoginSystem();
        if (login.isAdmin())
        	user = new Admin(LoginSystem.);
            return;
    }
    
}
