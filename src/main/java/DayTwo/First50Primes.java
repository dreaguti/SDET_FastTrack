package DayTwo;

public class First50Primes {
    public static void main(String[] args) {
        //Prime number - divisible only by 1 and itself
        //Find first 50 prime numbers

        int numberOfPrimes=50;
        int count=0; //it will increase if a number is prime
        int num=2; //a number to test to see if it's prime

        while (count < numberOfPrimes){
        boolean isPrime = true;
            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) { //if the result is not 0, it's not prime
                    isPrime = false; //boolean statement will be false
                    break; //break the loop
                }
            }
            if (isPrime) {
                //after the inner loop, if isPrime is still true,
                // print out the number and increase the count
                System.out.print(num + " ");
                count++;
            }
            num++; //increase the number to be able to test the next number
        }
    }
}
