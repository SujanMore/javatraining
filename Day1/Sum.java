public class Sum {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;

        int result = a + b + c;     //Sum of three variables

        System.out.println(result);

        b = 10;                     //Modify Value of variable b

        result = a + b + c;

        System.out.println(result);
    }
}