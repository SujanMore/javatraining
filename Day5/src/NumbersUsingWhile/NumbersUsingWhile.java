package NumbersUsingWhile;

public class NumbersUsingWhile {

    private int num;

    public NumbersUsingWhile(int num) {
        this.num = num;
    }


    public void squareOfnumbers() {
        int i = 1;
        while(i <= this.num){
            System.out.print((i * i) + " ");
            i++;
        }
        System.out.println();
    }

    public void cubeOfnumbers(){
        int i = 1;
        while(i <= this.num){
            System.out.print((i * i * i) + " ");
            i++;
        }
        System.out.println();
    }
}
