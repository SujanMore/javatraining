package StudentMarks;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        String name = input.nextLine();

        System.out.println("Enter Marks (Press -1 to Exit)");

        ArrayList<Integer> marks = new ArrayList<>();
        int tempMarks = 0;
        while(true){
            tempMarks = input.nextInt();
            if(tempMarks == -1) {
                break;
            }
            marks.add(tempMarks);
        }

        StudentMarks student = new StudentMarks(name, marks);
        System.out.println("Sum of Marks of " + student.getName()
                + " is " + student.getSumOfMarks() +
            "\nTotal Subjects: " + student.getNumOfMarks() +
            "\nMinimum Mark: " + student.getMinMarks() +
            "\nMaximum Mark: " + student.getMaxMarks() +
            "\nAverage Marks: " + student.getAverage());

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
