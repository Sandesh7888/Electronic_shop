package Project_Java;

import java.util.Scanner;

public class About_us extends Contact_us
{

    public static void displayAboutUsMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        About_us aboutUs = new About_us(); // Create an instance to access methods
        
        

                System.out.println("1. Contact Us");
                System.out.println("2. Service Guarantee");
                System.out.println("3. Easy Return");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); 

                switch (option) {
                    case 1:
                        Contact_us.displayContactMenu();
                        break;

                    case 2:
                        System.out.println("Service Guarantee: We ensure the best quality and service for our products.");
                        break;

                    case 3:
                        System.out.println("Easy Return: Return products within 30 days of receipt for a full refund.");
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                        break;
                }
            }
}

          
               