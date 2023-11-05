// Write a menu driven program to do the following:-
// a. To compare two strings
// b. To convert the uppercase character to lower and vice-versa
// c. To display whether an entered string is a substring of the other or not
// d. If the entered string is a substring of the other, replace it with “Hello”
import java.util.Scanner;

public class md4{
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while (true) {
            print("Enter a string: ");
            String str1 = scan.nextLine();
            println("0. Exit, 1. Compare, 2. swap case, 3. Contains Substring?, 4.If contains Substring, replace with hello");
            int choice = scan.nextInt();
            scan.nextLine();
            String str2;
            switch (choice) {
                case 0: return;
                case 1:
                    print("Enter another string: ");
                    str2 = scan.nextLine();
                    println("Is Equal = " + str1.equals(str2));
                    break;
                case 2:
                    println(swapCase(str1));
                    break;
                case 3:
                    print("Enter substring: ");
                    str2 = scan.nextLine();
                    println("Contains Substring = " + str1.contains(str2));
                    break;
                case 4:
                    print("Enter substring: ");
                    str2 = scan.nextLine();
                    println("Contains Substring = " + str1.replace(str2, "hello"));
                    break;
                default:
                    println("Invalid Choice!");
            }

        }
    }

    static String swapCase(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z') {
                s[i] = (char)(s[i] + ('A' - 'a'));
            }
            else if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = (char)(s[i] - ('A' - 'a'));
            }
        }
        return new String(s);
    }

    static void print(String str) {
        System.out.print(str);
    }
    static void println(String str) {
        System.out.println(str);
    }
}