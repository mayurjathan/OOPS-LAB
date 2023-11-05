
/*Write a Java program to count and display the number of characters, words, lines,
and vowels in a String. */
import java.util.*;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter the String : ");
        input = sc.nextLine();
        int charCount = input.length();
        System.out.println("Number of characters: " + charCount);
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        int lineCount = countLines(input);
        System.out.println("Number of lines: " + lineCount);
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;

    }

    public static int countLines(String input) {
        //String[] lines = input.split("\n");
        for(int i=0;i<input.length();i++)
        {
            if(input[i]=='\\'&&input[i+1]=='n')

        }
        return lines.length;

    }

    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
                count++;
            }
        }
        return count;

    }

}
