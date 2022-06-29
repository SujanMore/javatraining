package Consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{

    String ename;
    int salary;
    String gender;

    public Employee(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }

}

public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Sujan", 20000, "Male"));
        empList.add(new Employee("Shruti", 30000, "Female"));
        empList.add(new Employee("Nikhil", 40000, "Male"));
        empList.add(new Employee("Reetu", 50000,"Female"));

        //Function
        Function<Employee, Integer> bonus = emp-> emp.salary * 10/100;

        //Predicate
        Predicate<Integer> p = b -> b >= 5000;

        //Consumer
        Consumer<Employee> c = emp -> {
                                    System.out.println(emp.ename);
                                    System.out.println(emp.salary);
                                    System.out.println(emp.gender);
                                };

        for(Employee e: empList){

            int b = bonus.apply(e);     //Calculate Bonus

            if(p.test(b)){
                c.accept(e);
                System.out.println(b);
            }
        }

    }
}
