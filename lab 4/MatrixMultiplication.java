
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int i, j, k, l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr 1");
        i = sc.nextInt();
        j = sc.nextInt();

        System.out.println("Enter values");
        int arr[][] = new int[i][j];
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                arr[x][y] = sc.nextInt();
            }
        }

        System.out.println("Enter the size of arr 2");
        k = sc.nextInt();
        l = sc.nextInt();

        if (k != j) {
            System.out.println("Wrong dimentions");
            sc.close();
            return;
        }

        System.out.println("Enter values");
        int arr2[][] = new int[k][l];
        for (int x = 0; x < k; x++) {
            for (int y = 0; y < l; y++) {
                arr2[x][y] = sc.nextInt();
            }
        }

        int out[][] = new int[i][l];

        for (int m = 0; m < i; m++) {
            for (int m2 = 0; m2 < l; m2++) {
                out[m][m2] = 0;
                for (int n = 0; n < j; n++) {
                    out[m][m2] += arr[m][n] * arr2[n][m2];
                }
            }
        }

        for (int m = 0; m < i; m++) {
            for (int m2 = 0; m2 < l; m2++) {
                System.out.print(out[m][m2] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
