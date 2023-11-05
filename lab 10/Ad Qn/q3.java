import java.util.*;
class EvenNumberException extends Exception{
    EvenNumberException(){
        super("Even number detected!");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        var scan = new Scanner(System.in);
        try{
            int num = Integer.parseInt(scan.next());
            if(num%2==0)
                throw new EvenNumberException();
            System.out.println("You entered " + num);

        }
        catch(NumberFormatException e){
            System.out.println("Invalid number entered!");
        }
        catch(EvenNumberException e){
            System.out.println(e);
        }
        
    }
}