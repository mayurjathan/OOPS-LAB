//Write a program to check whether a number is palindrome or not
import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        
        int a=10101,sum=0,rev,c;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
        a=s.nextInt();
        c=a;
        while (a!=0)
        {
            rev=a%10;
            sum=(sum*10)+rev;
            a=a/10;
        }
        if(c==sum)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
}