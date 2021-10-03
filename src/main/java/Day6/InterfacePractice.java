package Day6;

//In Java, we can only extend one class
//BUT, Java has interfaces that we can implement as much as we want

//Interfaces give us more has-a relationship structure which means it gives your class a feature

//Every data field is constant and static by default
//We can't create an instance from the interface
//Every method is an abstract method by default

public interface InterfacePractice {
    //we don't have to say final because it's final by default
    final static int number = 10;
    int number1 = 10;

    void method();

    abstract void method1();

    //we can add the main method inside of the interface but there's no point
    public static void main(String[] args) {
        int number = 10;
        System.out.println("hello");
    }
}
