/* 
Enrollment No: 230180107032  
Practical: 2  
Question: 3  
Problem Statement: 
Write a method that returns a new array by eliminating the duplicate values in the array.
*/
import java.util.*;
public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        //Taking input in array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        //Printing the Array after removal
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }//Innerloop
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }//outerloop
        sc.close();
    }//End of main method
}//End of EliminateDuplicates
