package Inheritance;

public class Employee extends Person{

    private String title;
    private String employer;
    private String grade;
    private int salary;


    public Employee(String title, String employer, String grade, int salary) {
        super();

        this.title = title;
        this.employer = employer;
        this.grade = grade;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee's Name: %s, Phone: %s, email: %s, Title: %s, Employer: %s, Grade: %s, Salary: %d",
                super.getName(), super.getPhone(), super.getEmail(), getTitle(), getEmployer(), getGrade(), getSalary());
    }
}
