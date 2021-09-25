package DayOne;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        /*
        Enter an amount, for example: 11.56
        Your amount 11.56 consists of
	    11 dollars
        2 quarters
        0 dimes
	    1 nickels
	    1 pennies

         */

        //Always ask questions to the interview to make sure
        //you understood the question

        System.out.println("Enter an amount: ");

        Scanner input = new Scanner(System.in);

        double num=input.nextDouble(); //11.56

        int newNumber=(int)(num * 100); //it gives me the cent value of the money >> 1156
    //it will multiply first then convert it to int ^^

        //one dollar
        int dollars=newNumber/100;
        newNumber=newNumber%100; //56
        int quarters=newNumber/25; //2

        //remove the quarters from the number
        newNumber=newNumber%25; //6 cents

        //find the dimes
        int dimes=newNumber/10; //0

        //remove dimes from the number
        newNumber=newNumber%10; //6

        //find nickels
        int nickels=newNumber%5; //1

        //remove nickels
        newNumber=newNumber/5; //1

        //find pennies (remaining amount)
        int pennies=newNumber; //1

        System.out.println(dollars+" dollars");
        System.out.println(quarters+" quarters");
        System.out.println(dimes+" dimes");
        System.out.println(nickels+" nickels");
        System.out.println(pennies+" pennies");



    }
}
