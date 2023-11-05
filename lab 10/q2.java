//Write a program that handles ArrayOverflowException. [ Hint: Consider the array
// size]
import java.util.*;
class q2{
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        var scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
            System.out.println("Enter array elements: ");
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                array[i] = scan.nextInt();
            }
            System.out.println("Enter position: ");
            int position = scan.nextInt();
            System.out.println("The element is " + array[position-1]);

        }
        catch(InputMismatchException e){
            System.out.println("Exception raised: " + e);
            System.out.println("This is not a valid number!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception raised: " + e);
            System.out.println("Enter a valid position");
        }
        
    }
}