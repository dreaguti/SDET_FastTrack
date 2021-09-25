package DayTwo;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Prime number - divisible only by 1 and itself
        //Start with 2 up till 1000

        int limit = 1000;

        for (int num = 0; num <= 1000; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
