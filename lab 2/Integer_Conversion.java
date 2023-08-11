/*Write a Java program to read an int number, double number and a char from keyboard and
perform the following conversions:- int to byte, char to int, double to byte, double to int*/
import java.util.Scanner;
class Integer_Conversion
{
   public static void main(String[] args) 
    {
        int a,z,i;
        byte b,w;
        char c;
        double d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        a = s.nextInt();
        b = (byte) a;  
        System.out.println("Conversion into byte:"+b);
        System.out.print("Enter any Char:");
        c = s.next().charAt(1);
        z = (int)c;
        System.out.println("Conversion into int :"+z);
        System.out.print("Enter any double :");
        d = s.nextDouble();
        w=(byte)d;
        System.out.println("Conversion into byte :"+w);
        i=(int)d;
        System.out.println("Conversion into integer :"+i);
    }
}