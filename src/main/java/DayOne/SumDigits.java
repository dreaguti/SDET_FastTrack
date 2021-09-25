package DayOne;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        /*
        Q1: Sum of the digits in an integer.
        Write a program that reads an integer between 0 and 1000 and adds all of the digits in the integer.
        For example, if an intger is 932, the sum of all its digits is 14.

        NOTE: Solve without using loops

        HINT: Use % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93

        Here is an example: Enter a number between 0 and 1000: 999 The sum of the digits is 27.
         */

        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum=0;

        //input example: 987
        sum += number % 10; //sum=7
        number=number/10; //98

        sum += number %10; //sum=15
        number=number/10; //9
        //or number/=10;

        sum += number; //24

        System.out.println(sum);

    }
}
