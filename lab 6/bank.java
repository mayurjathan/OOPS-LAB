/*Create a base class called Bank that provides functionality to get rate of interest. 
But, rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks 
could provide 8%, 7% and 9% rate of interest.
 Write a Java program to calculate the interest for SBI, ICICI and AXIS banks, 
 by demonstrating the concept of method overriding and dynamic method dispatch. */
import java.util.Scanner;
class BankDemo{
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        Bank bank = null;
        System.out.println("Enter a Bank: (SBI/ICICI/AXIS) ");
        String bankChoice = scan.next();
        if (bankChoice.equals("SBI")){
            bank = new SBI();
        }
        else if (bankChoice.equals("ICICI")){
            bank = new ICICI();
        }
        else if (bankChoice.equals("AXIS")){
            bank = new AXIS();
        }
        else System.out.println("Invalid Choice!");

        System.out.println("Rate of Interest = " + bank.getRateOfInterest() + "%");
    }
}

abstract class Bank{
    private int r;
    public void setR(int r) {
        this.r = r;
    }
    public int getR() {
        return r;
    }
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    SBI(){
        setR(8);
    }
    int getRateOfInterest(){
        return (getR());
    }
}
class ICICI extends Bank{
    ICICI(){
        setR(7);
    }
    int getRateOfInterest(){
        return (getR());
    }
}
class AXIS extends Bank{
    AXIS(){
        setR(9);
    }
    int getRateOfInterest(){
        return (getR());
    }
}