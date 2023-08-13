/*Write a Java program to multiply and divide a number by 2 using bitwise operator. [Hint:
use left shift and right shift bitwise operators*/
import java.util.Scanner;

class bitwise {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int num, mul, div;
        System.out.println("Enter a number to perform bitwise operations : ");
        num = c.nextInt();
        mul = num << 1;
        div = num >> 1;
        System.out.println("The number multiplied by 2 is: " + mul + " and divided by 2 is: " + div);
    }
}