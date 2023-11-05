// Write a program for validating matrix. [Hint: Square matrix ] 
import java.util.*;
class SquareMatrixException extends Exception{
    SquareMatrixException(){
        super("This is not a square matrix!");
    }
}
class q5{
    public static void main(String[] args) {
        System.out.print("enter dimensions of a square matrix: ");
        var scan = new Scanner(System.in);
        try{
            int m = scan.nextInt();
            int n = scan.nextInt();
            if(m!=n){
                throw new SquareMatrixException();
            }
            else
                System.out.println("This is a valid Square Matrix.");
        }
        catch(InputMismatchException e){
            System.out.println("Exception raised: " + e);
            System.out.println("This is not a valid number!");
        }
        catch(SquareMatrixException e){
            System.out.println("Exception raised: " + e);
        }
        
    }
}