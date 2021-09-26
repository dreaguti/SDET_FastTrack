package Day3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //get two numbers and in the output give GCD (greatest number that can divide both numbers)
        //15, 30 - GCD should be 15

        int num1 = 1450;
        int num2 = 675;

        System.out.println(gcd(num1, num2));
        //gcd(num1, num2);
    }

    private static int gcd(int num1, int num2) {
        int gcd = 1;

        for (int divisor = 2; divisor < num2 && divisor < num1; divisor++) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                gcd = divisor;
            }
        }


        return gcd;
    }
}

