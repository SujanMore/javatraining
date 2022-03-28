package StudentMarks;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksRun {
    public static void main(String[] args) {
        int tempMarks = 0;
        ArrayList<Integer> marks = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student's Name: ");
        String name = input.nextLine();

        System.out.println("Enter Marks (Press -1 to Exit)");

        while(true){

            tempMarks = input.nextInt();
            if(tempMarks == -1) {
                break;
            }
            marks.add(tempMarks);
        }

        StudentMarks student = new StudentMarks(name, marks);
        System.out.println("Sum of Marks of " + student.getName() + " is " + student.getSumOfMarks());
        System.out.println("Total Subjects: " + student.getNumOfMarks());
        System.out.println("Minimum Mark: " + student.getMinMarks());
        System.out.println("Maximum Mark: " + student.getMaxMarks());
        System.out.println("Average Marks: " + student.getAverage());

        System.out.print("Add new mark: ");
        int addNum = input.nextInt();
        student.addMarks(addNum);
        System.out.println(student);

        System.out.println("Give Index of Mark to remove");
        int index = input.nextInt();
        student.removeMarks(index);
        System.out.println(student);

    }
}
