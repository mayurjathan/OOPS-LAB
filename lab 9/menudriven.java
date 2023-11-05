// Write a menu driven program to do the following:-
// a. To check whether a string is palindrome or not
// b. Write the string in an alphabetical order
// c. Reverse the string
// d. Concatenate the original string and the reversed string
import java.util.Scanner;

public class menudriven {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while (true) {
            println("Enter a string: ");
            String str = scan.nextLine();
            println("0. Exit, 1. Palindrome, 2. Sort, 3. Reverse, 4. Concatenate Reversed String");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    println("Palindrome = " + isPalindrome(str));
                    break;
                case 2:
                    println("Sorted String = " + sort(str));
                    break;
                case 3:
                    println("Reversed String = " + reverse(str));
                    break;
                case 4:
                    println("Concatenated String = " + concatenateReverse(str));
                    break;
                default:
                    println("Invalid Choice!");
            }

        }
    }

    static boolean isPalindrome(String str) {
        return new StringBuffer(str).reverse().toString().equals(str);
    }

    static String sort(String str) {
        char[] s = str.toCharArray();
        // sort string using insertion sort
        int i, j;
        for (i = 1; i < s.length; i++) {
            // save the value
            char val = s[i];
            // keep right shifting
            for (j = i; j > 0 && s[j - 1] > val; j--) {
                s[j] = s[j - 1];
            }
            // finally insert the value
            s[j] = val;
        }
        return new String(s);
    }

    static String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    static String concatenateReverse(String str) {
        return str.concat(new StringBuffer(str).reverse().toString());
    }

    static void print(String str) {
        System.out.print(str);
    }

    static void println(String str) {
        System.out.println(str);
    }
}