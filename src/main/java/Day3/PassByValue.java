package Day3;

public class PassByValue {
    public static void main(String[] args) {
        int a =1;
        int b=2;

        System.out.println("The value of a before the method call/invoke: "+a);
        System.out.println("The value of b before the method call/invoke: "+b);

        add(a,b);

        System.out.println("The value of a after the method call/invoke: "+a);
        System.out.println("The value of b after the method call/invoke: "+b);
    }

    //when you create a method with some arguments(parameters),
    //the program will create a copy of that variable and send it to the method
    static void add(int a, int b) {
         a=10;
         b=20;
        System.out.println("The value of a in the method: "+a);
        System.out.println("The value of b in the method: "+b);
    }
}
