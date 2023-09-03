/*Write a Java program to display principal diagonal elements and find their sum. 
[Hint: Principal Diagonal: The principal diagonal of a rectangular matrix is the diagonal which runs 
from the top left corner and steps down and right, until the right edge or the bottom edge is reached]. */
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int dim;

        System.out.print("Enter the size :");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();

        System.out.print("Enter values : ");
        int arr[][] = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("The sum = " + sum);

    }
}