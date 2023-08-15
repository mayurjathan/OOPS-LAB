
/*Write a Java program to find area and circumference of a rectangle.
3. (Hint: circumference = 2 (length + breadth) ; area= length x breadth) */
import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        int cir, length, breadth, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length : ");
        length = s.nextInt();
        System.out.print("Enter breadth: ");
        breadth = s.nextInt();
        cir = 2 * (length + breadth);
        area = length * breadth;
        System.out.println("The circumference of the rectangle is " + cir);
        System.out.println("The area of the rectangle is " + area);
    }
}
