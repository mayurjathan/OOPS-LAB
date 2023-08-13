/*Write a Java program to find the result of the following expressions for various values
of a & b:
a. (a << 2) + (b >> 2)
b. (b > 0)
c. (a + b * 100) / 10
d. a & b*/
import java.util.Scanner;
 class findresult {

    public static void main(String[] args) {    
        int a , b;
        char p;
    Scanner c = new Scanner(System.in);
    System.out.print("Enter 'a' value : ");
    a=c.nextInt();
    System.out.print("Enter 'b' value : ");
    b=c.nextInt();
    System.out.println( (a << 2) + (b >> 2));
    System.out.println( b > 0 );
    System.out.println( (a + b * 100) / 10);
    System.out.println( a & b);
    }
}
