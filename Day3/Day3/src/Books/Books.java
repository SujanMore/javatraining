package Books;

public class Books {

    private String name;
    private String writer;
    private int price;
    private int year;
    private int copiesSold;

    Books(String name, String writer, int price, int year) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.year = year;
        this.copiesSold = 0;
    }

    public String getName() {

        return name;
    }

    public int getCopiesSold() {

        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {

        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Books: " + name +
                ", written by " + writer +
                " in year " + year +
                ". " + copiesSold +
                " copies sold." + " Price: Rs." +
                price + '.';
    }
}
