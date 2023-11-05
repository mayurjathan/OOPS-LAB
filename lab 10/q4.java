//Create a user defined exception class which displays error message.
import java.util.*;
class ErrorException extends Exception{
    ErrorException(String s){
        super(s);
    }
}
class q4{
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        var scan = new Scanner(System.in);
        try{
            String s = scan.nextLine();
            throw new ErrorException(s);
        }
        catch(ErrorException e){
            System.out.println(e);
        }        
    }
}