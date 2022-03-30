package Books;

public class BooksRun {
    public static void main(String[] args) {

        Books harryPotter = new Books("Harry Potter & the Philisopher's Stone", "J.K. Rowling", 300, 1997);

        System.out.println(harryPotter);
        System.out.println("");

        harryPotter.setCopiesSold(15000);

        System.out.println("Number of copies sold of book: " + harryPotter.getName() + " is " + harryPotter.getCopiesSold());
        System.out.println("");

        System.out.println(harryPotter);
    }
}
