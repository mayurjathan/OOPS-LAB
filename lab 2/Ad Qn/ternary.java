/*Write a Java program to find largest and smallest among 3 numbers using ternary
operator. */ 
import java.util.*;
class ternary {
    public static void main(String[] args) {
        int a,b,c,max,min; 

        System.out.println("Enter 3 numbers ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        max = (a>b) ? ( (a>c) ? a : c) : ((b > c) ? b : c);
        min = (a<b) ? ( (a<c) ? a : c) : ((b < c) ? b : c);
        System.out.println("max = " + max + " min = " + min);
    }
}
