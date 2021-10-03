package Day6;

public class PolymorphismPractice extends AbstractPractice {
    public static void main(String[] args) {

        Object str = new String("Hello");
    }

    void method(){

    }
    //This is an overridden method
    //During the inheritance relationship, when we create two methods with the same name, it's called overriding
    //I have to keep the visibility the same or more
    //Static methods can't be overridden
    //Return type must be same or co-variant
    public void print(int a){
        System.out.println("This is from Polymorphism practice class");
    }

}
