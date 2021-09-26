package Day3;

public class MethodPractice {
    //Main method is the starting point of the program
    public static void main(String[] args) {
    //we will define the method
    //we will declare the variable when we create it
    }
    //Any new method(s) go(es) outside the main method
    //The purpose of using methods is to help the main method
    //and to organize and maintain the code.
    //By convention, a method has no more than 50 lines


    //non-void method has a return type and it has to return something
    //return has to match the return type in the method signature
    //return is not part of the signature
    //the method signature consists of return type, name, argument type, and number of args
    //access modifier is not part of the method signature
    public static int newMethod(int a){
        return 1;
    }

    public static int methodVoidWithoutReturn(int a) {
        //you can create a new method and call it later | ex: method();
        //method body
        return 0;
    }

    //void method doesn't have a return type and doesn't return anything
    //but we can still use return in void method, if we have some sort of conditions
    //it doesn't return anything, it just stops executing the method and goes back to where it came from
    public static void methodVoidWithReturn(int a, int b) { //calling above method
        //method body:
        if (a > b) {
            return;
        }

    }

}
