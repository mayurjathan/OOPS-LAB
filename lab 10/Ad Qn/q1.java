import java.util.*;
class InputException extends Exception{
    InputException(){
        super("Invalid Input!");
    }
}
class Main{
    public static void main(String[] args) throws InputException {
        var scan = new Scanner(System.in);
        int sum=0;
        while(true){
            try{
                int num = scan.nextInt();
                sum+=num;
                if (num==-1){
                    System.out.println("Sum = " + (sum+1));
                    return;
                }
            }
            catch(InputMismatchException e){
                throw new InputException();
            }
        }
    }
}