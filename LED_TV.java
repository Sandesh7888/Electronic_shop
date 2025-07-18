package Project_Java;

 abstract class  LED_TV extends TV 
{
	public LED_TV(String product, String screenSize, String resolution, String displayTech, String uniqueFeature,
            double price, double rating, String warranty, String userTestimonial, int refreshRate,
            String productDimensions)
{
    super(product, screenSize, resolution, displayTech, uniqueFeature, price, rating, warranty, null, userTestimonial, refreshRate, productDimensions);
}

@Override
public void displayDetails()
{
System.out.println("LED TV Details:");

}
}
