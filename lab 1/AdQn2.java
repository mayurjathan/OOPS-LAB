//Write a Java program to print factorial of a given no
import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
 int a,b,c=1;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number : ");
    a=s.nextInt();
    System.out.print("Factoril of "+a+" = ");
      for(b=1;b<=a;b++)
      {
          c=b*c;
      }
      System.out.println(c);
    }
}