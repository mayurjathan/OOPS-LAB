class Main {

    // Generic method to print an array of any type
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'e', 'l', 'l', 'o' };

        System.out.println("Printing Integer Array:");
        printArray(intArray);

        System.out.println("Printing Double Array:");
        printArray(doubleArray);

        System.out.println("Printing Character Array:");
        printArray(charArray);
    }
}
