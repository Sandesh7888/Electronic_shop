package Project_Java;

public class CancelOrder1
{

   public  static void cancelOrder(TV orderedTV,String paymentMode) 
    {
        if (orderedTV == null) 
        {
            System.out.println("No order to cancel.");
        } 
        else 
        {
            System.out.println("Your order is canceled successfully.");
            orderedTV = null;
            paymentMode = null;
        }
    }
}
