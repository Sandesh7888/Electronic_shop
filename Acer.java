package Project_Java;

public class Acer extends LED_TV {

	public Acer() 
	{
		super("Acer AR65AR2851UDFL", "164 cm (65)", "4K UHD", "LED", "Android Smart TV", 
	              129999.00, 4.5, "2 years", "Amazing sound quality with excellent display.", 
	              120, "1228 x 710 x 55 mm");
	    }

	    @Override
	    public void displayDetails()
	    {
	        System.out.println("Sony Bravia OLED TV Details:");
	        System.out.println("Product: " + getProduct());
	        System.out.println("Screen Size: " + getScreenSize());
	        System.out.println("Resolution: " + getResolution());
	        System.out.println("Display Technology: " + getDisplayTech());
	        System.out.println("Unique Feature: " + getUniqueFeature());
	        System.out.println("Price: INR " + getPrice());
	        System.out.println("Rating: " + getRating() + " out of 5");
	        System.out.println("Warranty: " + getWarranty());
	        System.out.println("User Testimonial: " + getUserTestimonial());
	        System.out.println("Refresh Rate: " + getRefreshRate() + " Hz");
	        System.out.println("Product Dimensions: " + getProductDimensions());
	    }

}
