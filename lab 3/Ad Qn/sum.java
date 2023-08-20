/*. Write a Java programs to evaluate the following series
a. Sin(x) =x - (x3
/3!) + (x5
/5!)-…
b. Sum=1 + (1/2)2 + (1/3)3 +… */
import java.util.Scanner;

class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= terms; i++) {
            sum += Math.pow(1.0 / i, i);
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
