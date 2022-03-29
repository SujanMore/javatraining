package Book;

import java.util.ArrayList;

public class Book {

    private final int id;
    private final String name;
    private final String rating;
    private final ArrayList<Reviews> reviews = new ArrayList<>();

    public Book(int id, String name, String rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void addReviews(Reviews reviews){
        this.reviews.add(reviews);

    }

    @Override
    public String toString() {
        return String.format("Book's id: %d, Title: %s, Rating: %s. ", id,
                name, rating) + "Reviews are: " + reviews;
    }
}
