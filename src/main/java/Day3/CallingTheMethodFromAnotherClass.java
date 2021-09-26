package Day3;

//Purpose: To print the prime numbers that have been written in a different class
public class CallingTheMethodFromAnotherClass {
    public static void main(String[] args) {
        //I want to get the prime numbers till 50
        //If we write the class name and put a dot,
        // then we are going to see the STATIC methods of that class
        PrimeNumbersWithMethods.primeNumbers(50);

        //calling a method from a different class
    }
}
