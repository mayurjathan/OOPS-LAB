
/*Create class Number with only one private instance variable as a double primitive
type. Include the following methods (include respective constructors) isZero( ),
isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isArmstrong(). The above
methods return boolean primitive type. */
import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        var scan = new Scanner(System.in);
        Number n = new Number(scan.nextDouble());
        System.out.println("isZero = " + n.isZero());
        System.out.println("isPositive = " + n.isPositive());
        System.out.println("isNegative = " + n.isNegative());
        System.out.println("isOdd = " + n.isOdd());
        System.out.println("isEven = " + n.isEven());
        System.out.println("isPrime = " + n.isPrime());
        System.out.println("isArmstrong = " + n.isArmstrong());
    }
}

class Number {
    private double n;

    Number() {
    }

    Number(double n) {
        this.n = n;
    }

    public boolean isZero() {
        return (n == 0);
    }

    public boolean isPositive() {
        return (n > 0);
    }

    public boolean isNegative() {
        return (n < 0);
    }

    public boolean isPrime() {
        if (n < 2)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean isOdd() {
        return (n % 2 == 1);
    }

    public boolean isEven() {
        return (n % 2 == 0);
    }

    public boolean isArmstrong() {
        int sum = 0, d = (int) n, rd;
        while (d != 0) {
            sum += (d % 10) * (d % 10) * (d % 10);
            d /= 10;
        }
        return (sum == n);
    }
}