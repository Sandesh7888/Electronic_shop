package Project_Java;

abstract class TV {
	TV orderedTV;
    private String product;
    private String screenSize;
    private String resolution;
    private String displayTech;
    private String uniqueFeature;
    private double price;
    private double rating;
    private String warranty;
    private String supportedInternetServices;
    private String userTestimonial;
    private int refreshRate;
    private String productDimensions;

    public TV(String product, String screenSize, String resolution, String displayTech, String uniqueFeature,
              double price, double rating, String warranty, String supportedInternetServices, String userTestimonial,
              int refreshRate, String productDimensions) {
        this.product = product;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.displayTech = displayTech;
        this.uniqueFeature = uniqueFeature;
        this.price = price;
        this.rating = rating;
        this.warranty = warranty;
        this.supportedInternetServices = supportedInternetServices;
        this.userTestimonial = userTestimonial;
        this.refreshRate = refreshRate;
        this.productDimensions = productDimensions;
    }

    public abstract void displayDetails();

    
    
    
    
    //Setter Method 
    public void setProduct(String product) { this.product = product; }
    public void setScreenSize(String screenSize) { this.screenSize = screenSize; }
    public void setResolution(String resolution) { this.resolution = resolution; }
    public void setDisplayTech(String displayTech) { this.displayTech = displayTech; }
    public void setUniqueFeature(String uniqueFeature) { this.uniqueFeature = uniqueFeature; }
    public void setPrice(double price) { this.price = price; }
    public void setRating(double rating) { this.rating = rating; }
    public void setWarranty(String warranty) { this.warranty = warranty; }
    public void setSupportedInternetServices(String supportedInternetServices) { this.supportedInternetServices = supportedInternetServices; }
    public void setUserTestimonial(String userTestimonial) { this.userTestimonial = userTestimonial; }
    public void setRefreshRate(int refreshRate) { this.refreshRate = refreshRate; }
    public void setProductDimensions(String productDimensions) { this.productDimensions = productDimensions; }

    
    
    
    // Getter methods
    public String getProduct() { return product; }
    public String getScreenSize() { return screenSize; }
    public String getResolution() { return resolution; }
    public String getDisplayTech() { return displayTech; }
    public String getUniqueFeature() { return uniqueFeature; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public String getWarranty() { return warranty; }
    public String getSupportedInternetServices() { return supportedInternetServices; }
    public String getUserTestimonial() { return userTestimonial; }
    public int getRefreshRate() { return refreshRate; }
    public String getProductDimensions() { return productDimensions; }
}
