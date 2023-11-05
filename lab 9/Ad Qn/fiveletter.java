// Write a program that reads a five-letter word from the user and produces all possible
// three letter words that can be derived from the letters of the five letter word. For
// example, the three letter words produced from the word “bathe” include the
// commonly used words “ate,” “bat,” “bet,” “tab,”, “hat,” “the” and “tea.”
import java.util.Scanner;

class fiveletter{
    public static void main(String[] args) {
        System.out.print("Enter a five-letter word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparisons

        if (word.length() != 5) {
            System.out.println("Not a five-letter word!");
        } else {
            generateThreeLetterWords(word);
        }
        scan.close();
    }

    public static void generateThreeLetterWords(String word) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println("" + word.charAt(i) + word.charAt(j) + word.charAt(k));
                    }
                }
            }
        }
    }
}
