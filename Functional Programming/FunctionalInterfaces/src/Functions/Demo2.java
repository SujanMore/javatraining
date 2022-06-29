package Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{

    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }

}
public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Sujan", 20000));
        empList.add(new Employee("Vinit", 30000));
        empList.add(new Employee("Nikhil", 40000));
        empList.add(new Employee("Narendra", 50000));

        Function<Employee, Integer> bonus = e -> {
                                int sal = e.salary;

                                if(sal>=10000 && sal <=20000){
                                    return (sal * 10/100);
                                } else if(sal>20000 && sal<=30000) {
                                    return (sal * 20/100);
                                } else if(sal>30000 && sal<=40000) {
                                    return (sal * 30/100);
                                } else if(sal>40000 && sal<=50000) {
                                    return (sal * 40/100);
                                } else {
                                    return (sal * 50/100);
                                }
        };

        Predicate<Integer> p = b -> b>5000;

        for(Employee employee: empList) {

            int b = bonus.apply(employee);

            if(p.test(b)) {
                System.out.println("Bonus Amount for " + employee.ename + " is: "
                        + bonus.apply(employee));
            }

        }
    }
}
