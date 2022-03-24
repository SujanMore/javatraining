package Calculation;

public class Calculation {

    private int num1;
    private int num2;

    public Calculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void menu(){
        System.out.println("Choose the calculation: ");
        System.out.println("------------------------");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("------------------------");
        System.out.println("Press:1/2/3/4     5:Exit");

    }

    public void add() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtract() {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiply() {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void divide() {
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
    }
}
