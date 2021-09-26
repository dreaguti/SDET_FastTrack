package Day2;

public class IntroToLoops {
    public static void main(String[] args) {
        //while loops
        //for loops
        //difference between both is syntax but otherwise they're the same
        //same logic

        //for int i
        //assigning variable (int, double, etc); condition; increment/decrement
        //print statement
        for (int i = 0; i <= 5; i++) {
            System.out.println(i); //prints 0-5
        }
        System.out.println("-----------------------------");
        //same for loop as above written as a while loop:
        int i=0;
        while (i<=5){
            System.out.println(i); //prints 0-5
            i++;
        }
        System.out.println("-----------------------------");
        //while loop & syntax:
        int a=0;
        while (a<=10){
            System.out.println(a); //prints 0-10
            a++;
        }
    }
}
