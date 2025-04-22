import java.util.*;

public class OddMatrixGen {
    public static void main(String[] args) {
        int a[][] = new int[6][6];
        Random rand = new Random();

        // Odd row set
        for (int i = 0; i < 6; i++) {
            int oddCount_r = 0;
            for (int j = 0; j < 5; j++) {
                a[i][j] = rand.nextInt(2);
                oddCount_r += a[i][j];
            }
            a[i][5] = (oddCount_r % 2 == 0) ? 1 : 0;
        }

        // Odd column set
        for (int j = 0; j < 6; j++) {
            int oddCount_c = 0;
            for (int i = 0; i < 5; i++) {
                oddCount_c += a[i][j];
            }
            a[5][j] = (oddCount_c % 2 == 0) ? 1 : 0;
        }

        boolean rowOdd = true, colOdd = true;

        // Count row odd
        for (int i = 0; i < 6; i++) {
            int rowCount = 0;
            for (int j = 0; j < 6; j++) {
                if (a[i][j] == 1) rowCount++;
            }
            if (rowCount % 2 == 0) rowOdd = false;
        }

        // Count column odd
        for (int j = 0; j < 6; j++) {
            int colCount = 0;
            for (int i = 0; i < 6; i++) {
                if (a[i][j] == 1) colCount++;
            }
            if (colCount % 2 == 0) colOdd = false;
        }

        // Print matrix
        System.out.println("Generated matrix is:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Print result
        if (rowOdd && colOdd) {
            System.out.println("-->> Every row and column have an odd number of 1's.");
        } else {
            System.out.println("-->> Every row and column do not have an odd number of 1's.");
        }
    }//Main method end
}//End of OddMatrixGen
