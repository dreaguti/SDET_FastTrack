package Day2;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        /*Write a function that prints out the numbers from 1 to 30
        For multiples of 3, print "FIN" instead of the number
        For multiples of 5, print "RA" instead of the number
        For multiples of 3 & 5, print "FINRA" instead of the number
         */

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
