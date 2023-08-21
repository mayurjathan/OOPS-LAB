
/*Find the trace and norm of a given square matrix. [Hint: Trace= sum of principal
diagonal elements; Norm= Sqrt(sum of squares of the individual elements of an
array)] */
import java.util.*;

class tracenorm {
    public static void main(String args[]) {
        int array[][] = new int[5][5];
        int i, j;
        double sum = 0, square = 0, result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = s.nextInt();
        System.out.println("Enter matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("You have entered the following matrix: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("The trace of the given matrix is: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    sum = sum + (array[i][j]);
                }
            }
        }
        System.out.println(sum);
        System.out.print("The normal of the given matrix is: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                square = square + (array[i][j]) * (array[i][j]);
            }
        }
        result = Math.sqrt(square);
        System.out.println(result);
    }
}