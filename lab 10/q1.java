// //Write a program that handles NumberFormatException. [ Hint: Invalid
// conversion of a string to a number]
import java.util.*;
class q1{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        var scan = new Scanner(System.in);
        try{
            int num = Integer.parseInt(scan.next());
            System.out.println("You entered " + num);

        }
        catch(NumberFormatException e){
            System.out.println("Invalid number entered!");
        }
        
    }
}