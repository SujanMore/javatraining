package Inheritance;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee("Java Programmer", "idigicloud",
                "A", 15200);

        employee.setName("Sujan");
        employee.setPhone("7738916406");
        employee.setEmail("sujanmore@gmail.com");

        System.out.println(employee);
    }
}
