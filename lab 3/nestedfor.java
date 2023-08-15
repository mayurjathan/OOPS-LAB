
/*Write a Java program to display the numbers in the following format
a. using nested for loop.
b. using for-each loop.
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */
class nestedfor {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        for (int c : a) {
            for (j = 1; j <= c; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
