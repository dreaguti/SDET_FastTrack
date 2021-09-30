package Day4;

public class AssigningValueToArray {
    public static void main(String[] args) {

        int[] arr=new int[10];
        //you can also write it like this but not commonly used: int arr[]=new int[20];
        for (int i = 0; i < arr.length; i++) {
            //Math class just use Math. and it will give all static methods from that class
            // random() method will create a number between the 0 and 1, it will be a double value and we need to do casting here.
            // it will return a number between 0 and 100
            arr[i] = (int) (Math.random() * 10); //(int) is casting so that it will return a number
        }
        //print out the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        
        //let's find the sum of the values of the array
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum is: "+sum);

        //let's find the largest element of the array
        //if you wanted to get the first largest, use only <
        //if you wanted to get the last largest, use <=
        int largestElement=arr[0];
        int largestElementIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if(largestElement<= arr[i]) {
                largestElement = arr[i];
                largestElementIndex=i;
            }
        }
        System.out.println("The largest element is: "+largestElement);
        System.out.println("The index of the largest element: "+largestElementIndex);
    }
}
