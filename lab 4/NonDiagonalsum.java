/*Write a Java program to display non diagonal elements and find their sum. [Hint: Non
Principal diagonal: The diagonal of a diagonal matrix from the top right to the bottom left
corner is called non principal diagonal. */
import java.util.Scanner;
class NonDiagonalSum {
    public static void main(String[] args) {
        int dim;

        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();
        System.out.println("Enter values : ");
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
                if (i != j && i + j != dim - 1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("The sum = " + sum);

    }
}