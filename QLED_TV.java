package Project_Java;

abstract class QLED_TV extends TV
{
	public QLED_TV(String product, String screenSize, String resolution, String displayTech, String uniqueFeature,
            double price, double rating, String warranty, String userTestimonial, String string, int refreshRate,
            String productDimensions)
    {
   super(product, screenSize, resolution, displayTech, uniqueFeature, price, rating, warranty, null, userTestimonial, refreshRate, productDimensions);
    }

@Override
public void displayDetails()
{
System.out.println("QLED TV Details:");

}

}
