//Write a Java program to print table of number entered by user .
import java.util.Scanner;
class table {
    public static void main(String[] args) {
int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number : ");
    a=s.nextInt();
    System.out.print("Enter the last multiplier : ");
    b=s.nextInt();
       for(c=1;c<=b;c++)
       System.out.println(a+"x"+c+"="+(a*c));
    }
}