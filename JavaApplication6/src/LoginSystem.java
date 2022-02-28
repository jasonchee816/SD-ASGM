import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

public class LoginSystem 
{
	private Scanner input = new Scanner(System.in);
    private int option = 0;
    private User user;
    
    public LoginSystem() throws IOException
    {
        System.out.println("FOOD ORDERING SYSTEM");
        System.out.println("=============================");
        while (option >2 || option <1)
        {
        	System.out.println("1. Login \n2. Register New Account");
            System.out.print("Please enter your choice: ");
            try 
            {
            	option = input.nextInt();
                if (option > 2 || option < 1)
                {
                	System.out.println("\nInvalid Input. Please try again.\n");
                }
            }catch(Exception e)
            {
                System.out.println("\nInvalid Input. Please enter integer only.\n");
                input.nextLine();
            }
        }
        
        if (option==2)
        {
        	System.out.println("Register Account");
        	String email ="";
        	String password="";
        	getEmailAndPswd(email, password);
        	
        }
        
        else 
        {
        	boolean accFound = false;
        	while (accFound==false)
        	{
	        	System.out.println("Login Account");
	        	String email ="";
	        	String password="";
	        	input.nextLine();
	        	getEmailAndPswd(email,password);
        		accFound = findAcc(email, password);
        		if (accFound==false)
        			System.out.println("\nInvalid Login. Email and password do not match.\n");
        	}
        }
    }
    
    public void getEmailAndPswd(String email, String password)
    {
		System.out.print("Email: ");
		email=input.nextLine();
		System.out.print("Password: ");
		password= input.nextLine();
    }
    
    public void registerNewAcc(String email, String password)
    {
    	try (FileWriter f = new FileWriter("account_list.txt", true); 
    			BufferedWriter b = new BufferedWriter(f); 
    			PrintWriter p = new PrintWriter(b);) 
        {
            p.print(String.format("\n%s\t%s", email, password));
            p.close();
            b.close();
            f.close();
        }
        catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean findAcc(String email, String password) throws IOException
    {
        int line_count = 0;
        try 
        (            
            FileReader reader = new FileReader("login.txt");
            LineNumberReader count = new LineNumberReader(reader);
        )
        {
            while (count.skip(Long.MAX_VALUE) > 0)
            {
            }
            line_count = count.getLineNumber() + 1; 
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening file");
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("login.txt"))) {
			for (int i = 0; i < line_count; i++)
			{
			    String current_line = reader.readLine();
			    String [] split_string = current_line.split("\t");
			    if (split_string[0].equals(email) && split_string[1].equals(password))
			        return true;
			}
			reader.close();
		}
        return false;
    }
	
}
