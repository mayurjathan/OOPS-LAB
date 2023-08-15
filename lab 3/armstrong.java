
/*Write a program to compute whether a no . is an Armstrong number or not.Use any of
the iteration statements */
import java.util.Scanner;
import java.lang.Math;

class armstrong {
    public static void main(String[] args) {
        int a, b, sum = 0, temp, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is armstrong number or not: ");
        a = s.nextInt();
        String n = Integer.toString(a);
        b = n.length();
        temp = a;
        while (a != 0) {
            c = a % 10;
            sum += Math.pow(c, b);
            a = a / 10;
        }
        if (sum == temp) {
            System.out.println("It is a Armstrong number");
        } else {
            System.out.println("It is not a Armstrong number ");
        }

    }
}