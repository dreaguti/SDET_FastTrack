package Day2;

import java.util.Scanner;

public class WarmUpTask_1 {
    public static void main(String[] args) {
        /* WARM UP TASK:
         Suppose a string string contains the first name and last name separated by a space.
         Write a code that separates the first name and last name.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first and last name: ");
        String name= input.nextLine();
        int indexOfSpace=name.indexOf(' ');
        String firstName=name.substring(0, indexOfSpace);
        String lastName=name.substring(indexOfSpace, name.length());
        System.out.println(firstName + lastName);

    }
}
