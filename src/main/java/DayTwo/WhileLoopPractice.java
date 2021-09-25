package DayTwo;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int num = 0;

        while (num < 20) {
            System.out.println("hello ");
            num++; //will only print hello  20 times
        }

        System.out.println("------------------------------------");

        /*Practice Task:
        int sum=0. i=1; while (i<10) {sum=sum+1; }
         */
        int sum = 0;
        int i = 1;
        while (i < 10) {
            sum = sum + i;
            //sum+=i ^^ same as above
            i++;
        }
        System.out.println(sum);
    }
}
