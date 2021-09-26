package Day2;

import java.util.Scanner;

public class LoopLogicForMaxValue {
    public static void main(String[] args) {
        /*
        Scanner input=new Scanner(System.in); int number, max; number=
        input.nextInt(); max=number;
        while (number !=0){
        number=input.nextInt();
        if (number>max) max-number; }
        System.out.println("max is: " + max);
        System.out.println("number " + number)
        */

        //We are going to get some integer inputs from the user
        //it will return the max value,
        //the program will stop when the user enters 0

        //find the maximum value based on the given input

        System.out.println("Enter some numbers: "); //2 3 5 7 44 0
        Scanner input=new Scanner(System.in);

        int number=input.nextInt(); //first entry is 1
        int max=number; //the max will be 1

        while(number !=0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
            System.out.println("Max value: "+ max);
    }
}
