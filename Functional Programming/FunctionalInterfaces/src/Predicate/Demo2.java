package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{

    String ename;
    int salary;
    int experience;

    public Employee(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

}
public class Demo2 {

    public static void main(String[] args) {

        //Ex1
        Employee emp1 = new Employee("John", 20000, 5);
        Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 2);
        System.out.println(pr.test(emp1));

        //Ex2
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(new Employee("Sujan", 20000, 1));
        a1.add(new Employee("Vinit", 30000, 2));
        a1.add(new Employee("Nikhil", 40000, 3));
        a1.add(new Employee("Narendra", 50000, 4));
        a1.add(new Employee("Hrishikesh", 60000, 5));

        for(Employee e:a1){

            if(pr.test(e)){
                System.out.println(e.ename);
            }
        }
    }
}
