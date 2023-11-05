//Write a program to accept five strings separately, concatenate and display them as a
// single string.
import java.util.Scanner;

public class concatstrings {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        String[] strings = new String[5];
        println("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            strings[i] = scan.nextLine();
        }

        String concatenated = new String();
        for (String string : strings) {
            concatenated = concatenated.concat(string);
        }
        println(concatenated);
    }

    static void print(String str) {
        System.out.print(str);
    }

    static void println(String str) {
        System.out.println(str);
    }
}