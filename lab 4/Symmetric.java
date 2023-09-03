
import java.util.Scanner;

class Symmetric {
    public static void main(String[] args) {
        int dim;

        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();

        System.out.println("Enter values");
        int arr[][] = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int flag = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println("Is symmetric");
        else
            System.out.println("Not symmetric");

    }
}
