package Day3;

public class RecursiveMethod {
    public static void main(String[] args) {
        method(0);
    }

    static void method(int a) {
        System.out.println(a++);
        method(a);
    }
}
