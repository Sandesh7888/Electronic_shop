package Project_Java;

import java.util.Scanner;

public class PlaceOrder  
{
    public static void placeOrder(Scanner scanner, TV orderedTV) 
    {
        if (orderedTV == null)
        {
            System.out.println("No TV selected. Please choose a TV first.");
        } else {
            System.out.println("Select payment mode:");
            System.out.println("1. Online");
            System.out.println("2. Cash");
            System.out.print("Please choose an option: ");
            int paymentChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            String paymentMode;
            switch (paymentChoice)
            {
                case 1:
                    paymentMode = "Online";
                    break;
                case 2:
                    paymentMode = "Cash";
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Cash.");
                    paymentMode = "Cash";
                    break;
            }

            System.out.println("Order placed for: " + orderedTV.getProduct());
            System.out.println("Price: INR " + orderedTV.getPrice());
            System.out.println("Warranty: " + orderedTV.getWarranty());
            System.out.println("Payment Mode: " + paymentMode);
            System.out.println("Expected Delivery: Within 10 days");
           
            
              
            }
        }

	
	
    }


