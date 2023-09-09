
/*Create a class Box that uses a parameterized method to initialize the dimensions of a box.
 (dimensions are width, height, depth of double type). 
The class should have a method that can return volume.
 Obtain an object and print the corresponding volume in main() function. */
import java.util.Scanner;

class Box {
    private int length;
    private int bredth;
    private int height;

    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter bredth:");
        bredth = sc.nextInt();
        System.out.println("Enter height:");
        height = sc.nextInt();
        sc.close();
        System.out.println("Box created");
    }

    Box(int l, int b, int h) {
        length = l;
        bredth = b;
        height = h;
        System.out.println("Box created");
    }

    int getVolume() {
        return length * bredth * height;
    }
}

class item {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Volume of the box is: " + b.getVolume());
    }
}
