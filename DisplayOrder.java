package Project_Java;

public class DisplayOrder  extends PlaceOrder
{
    


	public static void displayOrder(TV orderedTV, String paymentMode) {
        if (orderedTV == null) {
            System.out.println("No order placed yet.");
        }
        else {
            System.out.println("Order Details:");
            System.out.println("Product: " + orderedTV.getProduct());
            System.out.println("Price: INR " + orderedTV.getPrice());
            System.out.println("Warranty: " + orderedTV.getWarranty());
            System.out.println("Expected Delivery: Within 10 days");
        }
    }

	
}
