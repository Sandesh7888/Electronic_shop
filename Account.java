package Project_Java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Account 
{
    private static List<User> users = new ArrayList<>();

    public static void createAccount()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email id: ");
        String email = scanner.nextLine();

        if (!isValidEmail(email)) 
        {
            System.out.println("Invalid email. It must contain '@gmail.com'.");
            return;
        }

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (!isValidMobileNumber(mobileNumber)) {
            System.out.println("Invalid mobile number. It must be exactly 10 digits.");
            return;
        }

        System.out.print("Enter your location: ");
        String location = scanner.nextLine();

        System.out.print("Enter username for login: ");
        String username = scanner.nextLine();
        
        for (User user : users)
        {
            if (user.getUsername().equals(username))
            {
                System.out.println("Username already exists. Please choose a different username.");
                return;
            }
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the username already exists
       

        users.add(new User(name, email, mobileNumber, location, username, password));
        System.out.println("Account created successfully.");
    }
//Checks user entered password or username is match with stored Password
    public static boolean login() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users)
        {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
            {
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }

    
   /* public static User getUserProfile(String username)
    {
        for (User user : users) {
            if (user.getUsername().equals(username))
            {
                return user;
            }
        }
        return null;
    }*/
//Method to check email id is valid or not
    private static boolean isValidEmail(String email)
    {
        return email.contains("@gmail.com");
    }

  //Method to check mobile number is valid or not   
    private static boolean isValidMobileNumber(String mobileNumber)
    {
    	return mobileNumber.matches("\\d{10}");
    }
}
    
