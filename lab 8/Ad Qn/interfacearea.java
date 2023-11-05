
//Write a program to compute the area of a square and a triangle by using interface.
import java.util.Scanner;

interface Shape {
    public abstract double computeArea();
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double computeArea() {
        return side * side;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }
}

public class interfacearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();

        System.out.print("Enter the base length of the triangle: ");
        double triangleBase = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();

        // Create objects for Square and Triangle
        Shape square = new Square(squareSide);
        Shape triangle = new Triangle(triangleBase, triangleHeight);

        // Compute and display the areas
        double squareArea = square.computeArea();
        double triangleArea = triangle.computeArea();

        System.out.println("Area of the Square: " + squareArea);
        System.out.println("Area of the Triangle: " + triangleArea);

        scanner.close();
    }
}
