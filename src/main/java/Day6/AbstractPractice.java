package Day6;

//purpose of abstract: we don't want anybody to create an instance from that class
//We use this abstract class during inheritance
//It behaves like a regular class but we also have abstract methods that regular classes can't have

public abstract class AbstractPractice {
    //we want this method to have a body in the sub class
    //If I extend AbstractPractice class, I have to implement this method
    //If I extend AbstractPractice class and if subclass is also abstract then we don't have to implemement this method
    abstract void method();


    void print(){
        System.out.println("This is from Polymorphism practice class");
    }
}

//Regular or abstract class has "is-a" relationship