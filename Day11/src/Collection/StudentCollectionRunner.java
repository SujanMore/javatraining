package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentCompareDescending implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}
public class StudentCollectionRunner {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student(12,"Sujan"), new Student(25, "Vinit"),
                new Student(3, "Sandeep"));

        List<Student> studentsAl = new ArrayList<>(students);

        System.out.println("Students ArrayList: ");
        System.out.println(studentsAl);
        System.out.println();

        /*
            Sorting the students objects using comparator interface.
         */
        Collections.sort(studentsAl);
        System.out.println("Ascending sort by ID" + studentsAl);

        //Collections.sort(studentsAl, new StudentCompareDescending());
        studentsAl.sort(new StudentCompareDescending());
        System.out.println("Descending sort by ID" + studentsAl);


    }
}
