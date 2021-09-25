package DayTwo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Palindrome = same when read backwards

        System.out.println("Enter a word or number sequence: ");
        Scanner input=new Scanner(System.in);

        String str=input.nextLine().toLowerCase();
        int end=str.length()-1;
        int start=0;
        boolean isPalindrome=true;

        for (int i = 0; i < str.length()-1/2; i++) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                System.out.println("This is not a palindrome.");
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) {
            System.out.println("The input is a palindrome.");
        }
    }
}
