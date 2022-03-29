package Book;

public class Reviews {

    //Intellij suggested to declare them as final. Not sure why.
    private final int id;
    private final String review;

    Reviews(int id, String review){
        this.id = id;
        this.review = review;
    }

    @Override
    public String toString() {
        return "(id: " + id +
                ", review: " + review +
                ')';
    }
}
