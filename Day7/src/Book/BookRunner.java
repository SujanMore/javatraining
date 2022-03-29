package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----Book Entry-----");

        System.out.print("Enter Book ID: ");
        int id = Integer.parseInt(input.nextLine());

        System.out.print("Enter Book Title: ");
        String name = input.nextLine();

        System.out.print("Enter Book Rating: ");
        String rating = input.nextLine();

        Book book = new Book(id, name, rating);

        System.out.println("Enter Reviews: ");
        System.out.println("Enter blank to exit.");
        System.out.println("--------------------");

        int reviewID = 1;
        while (true){
            String description = input.nextLine();

            if(description.isEmpty()){
                break;
            }

            book.addReviews(new Reviews(reviewID, description));
            reviewID++;
        }

        System.out.println("--------------------");
        System.out.println(book);
    }
}
