import java.util.*;
class NegativeArraySizeException extends Exception{
    NegativeArraySizeException(){
        super("Array size cannot be negative!");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        var scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
            if(n<0)
                throw new NegativeArraySizeException();
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
        catch(NegativeArraySizeException e){
            System.out.println("Exception raised: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception raised: " + e);
            System.out.println("Enter a valid position");
        }
        
        
    }
}