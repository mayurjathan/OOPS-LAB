
/*Write a program to merge two arrays in third array. Also sort the third array in
ascending order. */
import java.util.Scanner;

class merge {
    public static void main(String[] args) {
        int t, t1, t2, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms in First Array : ");
        t1 = sc.nextInt();
        int a1[] = new int[t1];
        System.out.print("Enter the numbers in First Array : ");
        for (i = 0; i < t1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter number of terms in Second Array : ");
        t2 = sc.nextInt();
        int a2[] = new int[t2];
        System.out.print("Enter the numbers in Second Array : ");
        for (i = 0; i < t2; i++) {
            a2[i] = sc.nextInt();
        }
        t = t1 + t2;
        int c[] = new int[t + 1];
        for (i = 0; i < t1; i++)
            c[i] = a1[i];
        for (j = 0; j < t2; j++)
            c[i++] = a2[j];
        // sorting in ascending order
        for (i = 0; i < t; i++) {
            for (j = i + 1; j < t; j++)
                if (c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
        }
        System.out.print("Ascending order : ");
        for (i = 0; i < t; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
