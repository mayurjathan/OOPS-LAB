// Write a Java program to enter 10 numbers and display the number of positive,negative
// and zeros number.
import java.util.Scanner;
class number {
    public static void main(String[] args) {
        int a,d,b,p=0,n=0,z=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        a=s.nextInt();
        int[] val = new int[100];  
        System.out.print("enter numbers : ");
        for(b=1;b<=a;b++)
        {
            val[b]=s.nextInt();
            if(val[b]<0)
            n=n+1;
            else if(val[b]==0)
            z=z+1;
            else 
            p=p+1;
        }
        System.out.println("positive number "+p);
        System.out.println("negative number "+n);
        System.out.println("zero "+z);
    }
}