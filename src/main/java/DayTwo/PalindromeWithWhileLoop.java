package DayTwo;

import java.util.Scanner;

public class PalindromeWithWhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean isPalindrome=true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                System.out.println("This is not a palindrome.");
                break;
            }
            start++; //it's 0 first, then 1
            end--; //it's str.length-1, then str.length-2
        }
        if(isPalindrome) {
            System.out.println("The input is a palindrome.");
        }

        //make sure it's all lowercase
    }
}
