package Day4;
//***interview question***
//KNOW SORTING TYPES OF SORTING IN DATA STRUCTURES
// https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html

//better visual and explanation:
// https://visualgo.net/en/sorting?slide=1
public class SelectionSort {
    public static void main(String[] args) {
        // the objective here is to learn selection sort algorithm
        int[] arr = {55, 66, 78, 65, 908, 64, 1, 4, 5};

        // first loop will keep the current smallest element
        for (int i = 0; i < arr.length; i++) {
            int smallestElement = arr[i];
            int smallestElementIndex = i;

            // second loop will iterate the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                if(smallestElement > arr[j]) {
                    smallestElement = arr[j];
                    smallestElementIndex = j;
                }
            }
            //if there's a smaller one it goes outside the loop and swaps them so that it goes from smallest to largest
            //you can check the index or the value
            //see second website for better explanation
            if(smallestElement != arr[i]) {
                int temp = arr[i];
                arr[i] = smallestElement;
                arr[smallestElementIndex] = temp;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
