package Project_Java;

public class RatingReviewData
{
	
        private final StringBuilder reviews = new StringBuilder();
        private int totalRating = 0;
        private int count = 0;
        private String averageRating = "No ratings yet.";

        RatingReviewData() {}

        RatingReviewData(String averageRating, String review)
        {
            this.averageRating = averageRating;
            this.reviews.append(review);
        }

        // Adds a rating
        void addRating(int rating) {
            totalRating += rating;
            count++;
            averageRating = "Average Rating: " + (totalRating / (double) count);
        }

        // Adds a review
        void addReview(String review) {
            if (reviews.length() > 0) {
                reviews.append("\n");
            }
            reviews.append(review);
        }

        // Returns the average rating
        String getRatings() {
            return averageRating;
        }

        // Returns the list of reviews
        String getReviews() {
            return reviews.toString();
        }
    
}


