import java.util.*;

public class ArrayArithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Taking input in arrays
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Enter values for first 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter values for second 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.print("Enter operation (+ or -): ");
        char op = sc.next().charAt(0);

        // Perform operation
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (op == '+') {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                } else if (op == '-') {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }//End of Main method
}//End of ArrayArithmetics
