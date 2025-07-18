package Project_Java;
import java.util.Scanner;

public class TVStore {
    private static TV orderedTV;  // To store the currently selected TV
    private static String paymentMode;  // To store the payment mode

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to TV Store App");
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  

            switch (option) {
                case 1:
                    Account.createAccount();
                    break;

                case 2:
                    if (Account.login()) {
                        while (true) {
                            System.out.println("1. Choose a product");
                            System.out.println("2. Place an Order");
                            System.out.println("3. Display Order");
                            System.out.println("4. Cancel Order");
                            System.out.println("5. Terms and Conditions");
                            System.out.println("6. About Us");
                            System.out.println("7. View Our Offline Store");
                            System.out.println("8.Review and Rating");
                            System.out.println("9. Logout");
                            System.out.print("Choose an option: ");
                            int userOption = scanner.nextInt();
                            scanner.nextLine();  

                            switch (userOption) {
                                case 1:
                                    viewTVBrands(scanner);
                                    break;

                                case 2:
                                   PlaceOrder.placeOrder(scanner, orderedTV);
                                    break;

                                case 3:
                                    DisplayOrder.displayOrder(orderedTV,paymentMode);
                                    break;

                                case 4:
                                    CancelOrder1.cancelOrder(orderedTV,paymentMode);
                                    break;

                                case 5:
                                    System.out.println("Terms and Conditions functionality.");
                                    break;

                                case 6:
                                    About_us.displayAboutUsMenu();
                                    break;
                                case 7:{
                                	  
                                	 System.out.println("Select a city:");
                                     System.out.println("1. Pune");
                                     System.out.println("2. Mumbai");

                                     int choice = scanner.nextInt();
                                     if (choice == 1)
                                     {
                                         OfflineStore.showPuneStores();
                                     } else if (choice == 2) 
                                     {
                                    	 OfflineStore.showMumbaiStores();
                                     } else {
                                         System.out.println("Invalid choice.");
                                     }
                                     break;
                                	
                                      }
                                
                                case 8:
                                	handleRatingAndReview( scanner,orderedTV);
                                	break;

                                case 9:
                                    System.out.println("Logging out...");
                                    return;  // Exit the application

                                default:
                                    System.out.println("Invalid option. Try again.");
                                    break;
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
    /*private static void handleRatingAndReview(Scanner scanner)
    {
        if (orderedTV == null)
        {
            System.out.println("No TV selected. Please select a TV first.");
           return; 
        }
    }*/
    
    
    private static void viewTVBrands(Scanner scanner) {
        boolean backToMainMenu = false;
        while (!backToMainMenu) {
            System.out.println("Choose TV type:");
            System.out.println("1. OLED TV");
            System.out.println("2. LED TV");
            System.out.println("3. QLED TV");
            System.out.println("4. Back");
            System.out.print("Please choose an option: ");
            int tvChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (tvChoice) {
                case 1:
                    orderedTV = new Sony_Bravia();  
                    showTVOptions(scanner);
                    break;
                case 2:
                    orderedTV = new Acer();  
                    showTVOptions(scanner);
                    break;
                case 3:
                    orderedTV = new Hisense();  
                    showTVOptions(scanner);
                    break;
                case 4:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid TV type.");
                    break;
            }
        }
    }

    private static void showTVOptions(Scanner scanner) {
        boolean backToTVMenu = false;
        while (!backToTVMenu) {
            System.out.println("Choose an option:");
            System.out.println("1. Display Features");
            System.out.println("2. Select TV");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option)
            {
                case 1:
                    if (orderedTV != null) {
                        orderedTV.displayDetails();
                    } else {
                        System.out.println("No TV selected.");
                    }
                    break;
                case 2:
                    System.out.println("TV selected: " + orderedTV.getProduct());
                    backToTVMenu = true;  // Go back to main menu
                    break;
                case 3:
                    backToTVMenu = true;  // Go back to main menu
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    
    
    
    
    
    private static void handleRatingAndReview(Scanner scanner,TV orderedTV) {
        if (orderedTV == null) {
            System.out.println("No TV selected. Please select a TV first.");
            return;
        }

        System.out.println("1. Display Ratings and Reviews");
        System.out.println("2. Add Rating and Review");
        System.out.println("3. Delete Rating and Review");
        System.out.println("4. Back to Main Menu");
        System.out.print("Choose an option: ");
        int ratingReviewOption = scanner.nextInt();
        scanner.nextLine();  // Consume newline
1
        String product = orderedTV.getProduct();

        switch (ratingReviewOption) {
            case 1:
                RatingAndReview.displayRatingAndReview();
                break;
            case 2:
                RatingAndReview.addRatingAndReview(scanner, product);
                break;
            case 3:
                RatingAndReview.deleteRatingAndReview(product);
                break;
            case 4:
                break;  // Go back to main menu
            default:
                System.out.println("Invalid option. Please select a valid option.");
                break;
        }
    }
 

}
