package Day4;

public class ArrayLogic {
    public static void main(String[] args) {
        // what is array?
        // An array is an object and it stores data in it.

        int number1 = 5;
        int number2 = 10;
        int number3 = 15;
        int number4 = 20;
        int number5 = 25;
        int number6 = 30;
        //instead of above ^^ you can do int[] numArray={5, 10, 15, 20, 25, 30} or int[] numArray=new int[6]

        // new is the keyword, you will be using this whenever you create an object
        // We need to specify the type of the array (int, double, char, boolean)
        // We also need to specify the length of the array when you create it.
        int[] array1 = new int[10]; //HOW TO CREATE AN ARRAY BY SPECIFYING LENGTH AND ADDING DATA TO IT

        // if we are not giving the length of the array, then we can use the statement below:
        int[] array2 = { 1, 2, 3, 4 }; //HOW TO CREATE AN ARRAY W/O SPECIFYING LENGTH STARTING WITH DATA

        // if we just do this int[] array3; , we are creating a reference of the array
        // in the stack memory but there is no array yet.
        // *** whenever we use the "new" keyword, we are creating the actual object/array in the heap memory
        int[] array3;
        array3 = new int[5]; //same as int[] array3=new int[5];

        // when we create a variable, int a, there is no initial value (means int a has not been initialized aka has not been given a value)
        // but arrays have an initial value (see below)
        int a;
        a = 10; //now we have initialized, int a

        // for int the initial value is 0, for boolean it is false
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " "); //HOW TO PRINT AN ARRAY
        }

        System.out.println("\n==================================");

        //EXAMPLE OF BOOLEAN ARRAY:
        boolean[] booleanArray = new boolean[5];
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.print(booleanArray[i] + " ");
        }
        // string is a char array, we can create a string without using new keyword but it's only special to the String class in\ Java
        String str = new String("Hello");

    }
}
