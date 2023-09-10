public class Square {
    public static void main(String[] args) {
        int intResult = square(3);
        double doubleResult = square(0.2);

        System.out.println("Square of 3: " + intResult);
        System.out.println("Square of 0.2: " + doubleResult);
    }

    // Method to square an integer
    static int square(int x) {
        return x * x;
    }

    // Method to square a double
    static double square(double x) {
        return x * x;
    }
}
