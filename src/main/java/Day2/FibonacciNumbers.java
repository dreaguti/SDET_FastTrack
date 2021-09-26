package Day2;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Fibonacci Numbers
        //1, 1, 2, 3, 5, 8, 13, 21 (add previous number to get next)
        int sum=0;
        int sum1=0;
        int sum2=1;
        for(int i=0; i<10; i++){
            sum=sum1+sum2;
            //the purpose of that is storing the sum into the previous index
            //so we can store the old values
            sum1=sum2;
            sum2=sum;
            System.out.print(sum+" ");
        }
    }
}
