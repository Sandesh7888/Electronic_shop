package Project_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RatingAndReview {
    private static List<RatingReview> ratingReviews = new ArrayList<>();

    static {
        ratingReviews.add(new RatingReview("Sony Bravia", "4.5", "Excellent picture quality. Worth every penny."));
        ratingReviews.add(new RatingReview("Acer", "4.0", "Good value for money. The sound could be better."));
        ratingReviews.add(new RatingReview("Hisense", "3.5", "Decent performance, but has some issues with color accuracy."));
    }

    public static void displayRatingAndReview() {
        for (RatingReview rr : ratingReviews) {
            System.out.println(rr);
        }
    }

    public static void addRatingAndReview(Scanner scanner, String product) {
        System.out.print("Enter rating (1-5): ");
        String rating = scanner.nextLine();

        System.out.print("Enter your review: ");
        String review = scanner.nextLine();

        for (RatingReview rr : ratingReviews) {
            if (rr.getProduct().equalsIgnoreCase(product)) {
                rr.setRating(rating);
                rr.setReview(review);
                System.out.println("Rating and review updated successfully.");
                return;
            }
        }

        ratingReviews.add(new RatingReview(product, rating, review));
        System.out.println("Rating and review added successfully.");
    }

    public static void deleteRatingAndReview(String product)
    {
        for (RatingReview rr : ratingReviews) {
            if (rr.getProduct().equalsIgnoreCase(product)) {
                ratingReviews.remove(rr);
                System.out.println("Rating and review deleted successfully.");
                return;
            }
        }
        System.out.println("You have not added a review yet.");
    }
    
}

class RatingReview
{
    private String product;
    private String rating;
    private String review;

    public RatingReview(String product, String rating, String review) {
        this.product = product;
        this.rating = rating;
        this.review = review;
    }

    public String getProduct() {
        return product;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Product: " + product + "\nRating: " + rating + "\nReview: " + review;
    }
}
