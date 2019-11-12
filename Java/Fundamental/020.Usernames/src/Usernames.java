
import java.util.Scanner;

public class Usernames {

    @SuppressWarnings("null")
	public static void main(String[] args) {
    	String username, password = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        username = s.nextLine();
        System.out.println("Enter password:");
        password = s.nextLine();
        
        if ((username.equals("alex"))&&(password.equals("mightyducks")))
        	System.out.println("You are now logged into the system!");
        else if ((username.equals("emily"))&&(password.equals("cat")))
        	System.out.println("You are now logged into the system!");
        else
        {
        	System.out.println("Your username or password was invalid!"); 
        	
        }
        
        

    }
}
