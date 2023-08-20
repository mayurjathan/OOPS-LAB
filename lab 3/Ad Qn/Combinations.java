
/*Write a program to print all combinations of four digit number. A four digit number is
generated using only four digits {1, 2, 3, 4}.
• Case 1: Duplication of digit is allowed.
• Case 2: Duplication of digit is not allowed. */
import java.util.Scanner;

class Combinations {
    public static void main(String[] args) {
        int c, i = 3, b, rev;
        Scanner s = new Scanner(System.in);
        int[] a = new int[4];
        System.out.print("Enter a four digit number : ");
        b = s.nextInt();
        while (b != 0) {
            rev = b % 10;
            a[i] = rev;
            i--;
            b /= 10;
        }

        System.out.print(
                "Case 1: Duplication of digit is allowed.\nCase 2: Duplication of digit is not allowed.\n Enter an option : ");
        c = s.nextInt();
        switch (c) {
            case 1:
                for (int w = 0; w < 4; w++) {
                    for (int x = 0; x < 4; x++) {
                        for (int y = 0; y < 4; y++) {
                            for (int z = 0; z < 4; z++) {

                                System.out.println(a[w] + "" + a[x] + "" + a[y] + "" + a[z]);

                            }
                        }
                    }
                }
                break;
            case 2:
                for (int w = 0; w < 4; w++) {
                    for (int x = 0; x < 4; x++) {
                        for (int y = 0; y < 4; y++) {
                            for (int z = 0; z < 4; z++) {
                                if (w != x && x != y && y != z && z != x) {
                                    System.out.println(a[w] + "" + a[x] + "" + a[y] + "" + a[z]);
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}