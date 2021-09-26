package Day3;

public class PalindromicPrime {
    public static void main(String[] args) {
        //Purpose: To find all the palindromic primes till 1000;
        int limit = 1000;

        for (int num = 2; num < limit; num++) {
            //if the number is a palindrome and a prime then the condition will be true
            String numtoString = "" + num;
            if (PrimeNumbersWithMethods.isPrime(num) && Day2Review.isPalindrome(numtoString)) {
                System.out.print(num + " ");
            }
        }

    }
}
