package NumbersForLoop;

public class NumbersForLoop {

    private int num;

    public NumbersForLoop(int num){
        this.num = num;
    }

    public boolean checkPrime(){
        for(int i = 2; i < this.num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public int sumToNum(){
        int sum = 0;

        for(int i = 1; i <= this.num; i++){
            sum += i;
        }

        return sum;
    }

    public int sumOfDivisors(){
        int sum = 0;

        for(int i = 2; i < this.num; i++){
            if(this.num % i == 0){
                sum += i;
            }
        }

        return sum;
    }

    public void printTriangleOfNum() {

        for(int i = 1; i <= this.num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
