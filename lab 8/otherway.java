
//Write a program to compute the areas of a rectangle and a circle by using interface.
import java.util.*;

import javafx.scene.shape.Circle;

interface shape {
    public abstract double computearea();
}

class Rectangle implements shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computearea() {
        return length * width;
    }
}

class circle implements shape {
    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    public double computearea() {
        return Math.PI * radius * radius;
    }

}

class otherway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double Length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double Width = scanner.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double Radius = scanner.nextDouble();
        Rectangle rec = new Rectangle(Length, Width);
        circle cir = new circle(Radius);
        double rectarea = rec.computearea();
        double cirarea = cir.computearea();
        System.out.println("Area of Rectangle is " + rectarea);
        System.out.println("Area of Circle is " + cirarea);
        scanner.close();

    }
}
