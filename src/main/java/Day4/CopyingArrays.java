package Day4;

public class CopyingArrays {
    public static void main(String[] args) {
        //Create two arrays and make a copy of them

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        //what will happen if I copy the array?
        arr1=arr2; //see explanation below:
        //arr1 will go to the trash can and there will be no more arr1 object
        //you are going to still have the reference for arr1, but it will show arr2's object (they will point to the same object and will have the same values)
        //we are telling arr1 to show the arr2 object after that
        //-----------------------------------------------------------------------

        //if we want to make a hard copy of arr2,
        // we have to go to arr2's index 0 and assign the value to the index 0 of arr1.

        //For array manipulation, we have to create a for loop
        for (int i = 0; i < arr2.length; i++) {
            //arr2[i] will return an integer/number
            arr1[i]=arr2[i]; //assign each index of arr1 to arr2
        }

        //this will print out the array:
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Array 1: "+arr1[i]+"\nArray 2: "+arr2[i]); //will print out each index of each array -- all indexes should match
        }
    }
}
