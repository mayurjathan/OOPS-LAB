/*. Write a Java programs to evaluate the following series
a. Sin(x) =x - (x3
/3!) + (x5
/5!)-…
b. Sum=1 + (1/2)2 + (1/3)3 +… */
import java.util.Scanner;

 class sineseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x in degrees: ");
        double x = Math.toRadians(sc.nextDouble());

        System.out.print("Enter the number of terms: ");
        int t= sc.nextInt();

        double result = 0;
        int sign = 1;
        for (int i = 1; i <= t; i += 2) {
            result += sign * Math.pow(x, i) / factorial(i);
            sign *= -1; // Change sign for each term
        }

        System.out.println("Sin(" + x + ") = " + result);

        sc.close();
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
