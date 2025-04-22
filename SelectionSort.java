import java.util.*;
public class SelectionSort {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        //taking input in unsorted array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }//for loop

        // Selection Sort
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }//if-statement
            }//inner loop
        }//outer loop
        //Printing the Sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }//for loop

        sc.close();
    }//end of Main Method
}//End of SelectionSort

