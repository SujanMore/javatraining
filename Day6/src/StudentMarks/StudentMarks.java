package StudentMarks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {

    private final String name;
    private final ArrayList<Integer> marks = new ArrayList<Integer>();

    public StudentMarks(String name, ArrayList<Integer> marks) {
        this.name = name;

        /* Using Collections to all elements of the
        marks ArrayList Parameter to the member variable pf the class */
        this.marks.addAll(marks);
    }

    public String getName() {
        return name;
    }

    public int getNumOfMarks(){
        return marks.size();
    }

    public int getSumOfMarks(){
        int sum = 0;
        for (Integer mark : this.marks) {
            sum += mark;
        }

        return sum;
    }

    public int getMaxMarks(){

        int maxMark = Integer.MIN_VALUE;

        /*
        for (Integer getMark : this.marks){
            if(getMark > maxMark){
                maxMark = getMark;
            }
        }
        */

        maxMark = Collections.max(marks);

        return maxMark;
    }

    public int getMinMarks(){
        int minMark = Integer.MAX_VALUE;

        /*
        for (Integer getMark : this.marks){
            if(getMark < minMark){
                minMark = getMark;
            }
        }
        */

        minMark = Collections.min(marks);

        return minMark;
    }

    public BigDecimal getAverage(){
        int sum = getSumOfMarks();
        int num = getNumOfMarks();

        /* Use RoundingMode when dividing BigDecimal numbers */
        return new BigDecimal(sum).divide(new BigDecimal(num), 5, RoundingMode.UP);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

}
