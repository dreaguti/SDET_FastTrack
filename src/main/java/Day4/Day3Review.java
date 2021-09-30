package Day4;

public class Day3Review {
    //we can create a variable inside of the class and outside of any method
    int num=100; //variable
    public static void main(String[] args) {
        //time streaming happens from the main method

        //we can create a variable in any method
        int a = 10;
        int b = 20;
        System.out.println("The value of a and b outside of the add method: " + a + ", " + b);

        //we can create a variable in the for loop
        for (int i = 0; i < args.length; i++) { //the variable is i

        }
    }

    //we can create a variable using the method header
    private static void add(int a, int b) {
        a = 20;
        b = 40;
        System.out.println("The value of a and b inside of the add method: " + a + ", " + b);
        //doesn't change the value unless you're inside the add method and change the values of the variables

    }
}

//method header, for loop, inside of the class, outside of any method