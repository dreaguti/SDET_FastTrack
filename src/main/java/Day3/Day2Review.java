package Day3;

import java.util.Scanner;

public class Day2Review {
    public static void main(String[] args) {
        // Write a code that checks a given word/number to see if it's a palindrome or not

        System.out.println("Enter a word or number: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        isPalindrome(str);
    }
        public static boolean isPalindrome(String str){
            int low = 0; //first index
            int high = str.length() - 1; //last index
            //boolean isPalindrome = true;
            for (int i = 0; i < str.length() / 2; i++) { //divided by 2 logic is to save execution time
                if (str.charAt(low) != str.charAt(high)) {
                    //isPalindrome = false;
                    //System.out.println("It is NOT a palindrome.");
                    return false;
                    //break;
                }
                low++; //the next index to be checked will be index 2
                high--; //it will get closer to the first index
            }
            return true;

//        if (isPalindrome) {
//            System.out.println("It is a palindrome.");
//        }
    }
}
