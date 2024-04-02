package Entity;

import Entity.Enum.CategoryRating;
import Entity.Enum.CategorySubjectId;

public class Review {
    private int reviewId;
    private String userId;
    private CategorySubjectId subjectId;
    private CategoryRating rating;
    private String text;


    public Review() {
    }

    public Review(int reviewId, String userId, CategorySubjectId subjectId, CategoryRating rating, String text) {
        this.userId = userId;
        this.subjectId = subjectId;
        this.rating = rating;
        this.text = text;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CategorySubjectId getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(CategorySubjectId subjectId) {
        this.subjectId = subjectId;
    }

    public CategoryRating getRating() {
        return rating;
    }

    public void setRating(CategoryRating rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "(" + userId + ": " + subjectId + ": " + rating + ": " + text +")";
    }
}
