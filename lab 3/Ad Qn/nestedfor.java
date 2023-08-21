/*Write a Java program to display the numbers in the following format (Hint: use nested
for loop).
1
2 3
4 5 6
7 8 9 10 */
class nestedfor {
    public static void main(String[] args) {
        int i, j, c = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
