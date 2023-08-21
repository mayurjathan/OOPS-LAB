
/*Print all the prime numbers in a given 1D array. */
import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        int t, i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        t = sc.nextInt();
        int a[] = new int[t];
        System.out.print("Enter the numbers : ");
        for (i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Prime numbers are : ");
        for (i = 0; i < t; i++) {
            count = 0;
            for (j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}