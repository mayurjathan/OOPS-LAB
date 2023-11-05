//Write a program for checking the negative root of a number. [Hint: Input negative
// number]
import java.util.*;
class NegativeRootException extends Exception{
    NegativeRootException(){
        super("The Square root of a negative number is not real!");
    }
}
class q6{
    public static void main(String[] args) {
        System.out.print("enter a number to find square root of: ");
        var scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
            if(n<0){
                throw new NegativeRootException();
            }
            System.out.print("The square root of " + n + " is " + Math.sqrt(n));
        }
        catch(InputMismatchException e){
            System.out.println("Exception raised: " + e);
            System.out.println("This is not a valid number!");
        }
        catch(NegativeRootException e){
            System.out.println("Exception raised: " + e);
        }
        
    }
}