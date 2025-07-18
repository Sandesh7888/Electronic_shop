package Project_Java;

public class Hisense extends QLED_TV

{

	

	  Hisense()
	  {
	        super("Samsung QLED 4K TV", "55 inches", "4K UHD", "QLED", "Quantum Dot Technology", 
	              75000.00, 4.8, "3 years", "Samsung Smart Hub, Alexa Compatibility", 
	              "Excellent color accuracy and brightness.", 120, "55 x 32 x 2 inches");
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("QLED TV Details:");
	        System.out.println("Product: " + getProduct());
	        System.out.println("Screen Size: " + getScreenSize());
	        System.out.println("Resolution: " + getResolution());
	        System.out.println("Display Technology: " + getDisplayTech());
	        System.out.println("Unique Feature: " + getUniqueFeature());
	        System.out.println("Price: INR " + getPrice());
	        System.out.println("Rating: " + getRating() + " out of 5");
	        System.out.println("Warranty: " + getWarranty());
	        System.out.println("Supported Internet Services: " + getSupportedInternetServices());
	        System.out.println("User Testimonial: " + getUserTestimonial());
	        System.out.println("Refresh Rate: " + getRefreshRate() + " Hz");
	        System.out.println("Product Dimensions: " + getProductDimensions());
	    }
	}