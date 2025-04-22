/* 
Enrollment No: 230180107032  
Practical: 2  
Question: 2  

Problem Statement: 
Write a generic method that returns the minimum elements and their indices in a two-dimensional array.
*/
import java.util.*;

public class MinElementFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a 2D array (fixed size for simplicity)
        int[][] array = new int[3][3];

        // Taking input for the 2D array
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        //prints the entered array 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+"");
            }
            System.out.println();
        }

        // Initialize minimum element with the first element of the array
        int min = array[0][0];
        int minRow = 0, minCol = 0;

        // Find the minimum element and its position
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        // Display the minimum element and its position
        System.out.println("Minimum element: " + min);
        System.out.println("Position: Row " + minRow + ", Column " + minCol);

        sc.close();
    }
}
