package Day3;

public class PrimeNumbersWithMethods {
    public static void main(String[] args) {
        //Prime number is a number that's divisible only by 1 and itself
        //starts with 2 and so on up to 100

        int limit=100;
        primeNumbers(limit);

    }
    public static void primeNumbers(int limit) {
        for (int number = 2; number < limit; number++) {

            if(isPrime(number)){
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int num){
        //prime should be greater than 1
        if (num <= 1) {
            System.out.println("The number can't be less than 1");
        return false;
    }
        //prime number can be divided by itself
		for (int divisor = 2; divisor < num; divisor++) {
        if (num % divisor == 0)
            return false;
    }

		return true;
    }

}
