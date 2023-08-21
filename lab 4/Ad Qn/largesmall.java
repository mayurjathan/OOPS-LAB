
/*Find the largest and smallest element in 1D array. */
import java.util.Scanner;

class largesmall {
    public static void main(String[] args) {
        int t, i, large, small;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        t = sc.nextInt();
        int a[] = new int[t];
        System.out.print("Enter the numbers : ");
        for (i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        small = a[0];
        large = a[0];
        for (i = 0; i < t; i++) {
            if (a[i] > large)
                large = a[i];
            else if (a[i] < small)
                small = a[i];
        }
        System.out.println("Largest number : " + large);
        System.out.println("Smallest number : " + small);
    }
}