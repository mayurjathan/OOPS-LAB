
/*Search for an element in a given matrix and count the number of its occurrence*/
import java.util.Scanner;

class search {
    public static void main(String[] args) {
        int t, i, j, count = 0, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        t = sc.nextInt();
        int a[] = new int[t];
        System.out.print("Enter the numbers : ");
        for (i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched and counted : ");
        s = sc.nextInt();
        for (i = 0; i < t; i++) {
            if (s == a[i])
                count++;
        }
        System.out.println("The number '" + s + "' has occured " + count + " times");
    }
}
