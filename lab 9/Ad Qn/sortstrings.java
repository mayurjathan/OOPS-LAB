import java.util.Arrays;
import java.util.Scanner;

public class sortstrings{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        
        // Create an array to store the strings
        String[] arr = new String[n];
        
        // Read the strings from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = scanner.next();
        }
        
        // Sort the array in alphabetical order
        Arrays.sort(arr);
        
        // Display the sorted strings
        System.out.println("Strings in alphabetical order:");
        for (String s : arr) {
            System.out.println(s);
        }
        
        scanner.close();
    }
}
