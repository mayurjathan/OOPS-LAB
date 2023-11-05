//Write a Java program to replace an entered word to all repeating characters.
import java.util.Scanner;
public class repeat {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        var scan = new Scanner(System.in);
        String word = scan.nextLine();

        // find the first repeating character
        char firstRepeating = ' ';
        outer:
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++)
                if (word.charAt(j) == letter) {
                    firstRepeating = letter;
                    break outer;
                }
        }
        // replace every letter of the word with that character
        if(firstRepeating != ' ')
            for (int i = 0; i < word.length(); i++)
                word = word.replace(word.charAt(i), firstRepeating);
        
        System.out.println("Replaced word = " + word);
    }
}
