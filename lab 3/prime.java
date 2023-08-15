
/*
 * Write a Java program to generate prime numbers between n and m.(Hint: A prime
 * number is a natural number greater than 1 that has no positive divisors other
 * than 1 and
 * itself. Eg: 2, 3, 5,7,11 etc.)
 */
import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        int n, m, i, j, count;
        Scanner c = new Scanner(System.in);
        System.out.print("Enter first term : ");
        n = c.nextInt();
        System.out.print("Enter second term : ");
        m = c.nextInt();
        System.out.print("Prime numbers are : ");
        for (i = n; i <= m; i++) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}