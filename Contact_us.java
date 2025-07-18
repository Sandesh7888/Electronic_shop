package Project_Java;

import java.util.Scanner;

public class Contact_us {

	 public static void displayContactMenu() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("a. Call Us");
         System.out.println("b. WhatsApp Us");
         System.out.println("c. Email Us");
         System.out.println("d. Exit");
         System.out.print("Choose an option: ");
         char option = scanner.nextLine().charAt(0);

         switch (option) {
             case 'a':
                 callUs();
                 displayContactMenu() ;
                 break;

             case 'b':
                 whatsappUs();
                 displayContactMenu() ;
                 break;

             case 'c':
                 emailUs();
                 displayContactMenu() ;
                 break;
             case 'd':
            	      return ;

             default:
                 System.out.println("Invalid option. Try again.");
                 break;
         }
     }

     private static void callUs() 
     {
         System.out.println("For E-Commerce Related Queries:");
         System.out.println("1800 889 1055");
         System.out.println("(9:30 AM to 7:30 PM, 365 days)");
         System.out.println("For Store Related Queries:");
         System.out.println("1800-889-1044");
         System.out.println("(9:00 AM to 9:00 PM, 365 days)");
     }

     private static void whatsappUs()
     {
         System.out.println("We are now on WhatsApp.");
         System.out.println("Send Hi! to +91 7977912345");
     }

     private static void emailUs() 
     {
         System.out.println("Email Us: reliancedigital@ril.com");
     }
 

}




