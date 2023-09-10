import java.util.Scanner;
public class BikeDemo{
    public static void main(String[] args) {
        Bike bike;
        var s = new Scanner(System.in);
        System.out.print("Is the bike splender?: (y/n) ");
        String gameChoice = s.next();
        if(gameChoice.equals("y"))
            bike = new Splender();
        else bike = new Bike();
        bike.run();
    }
}

class Bike{
    private int speedLimit=200;
    void run(){
        System.out.println("Speed limit of Bike is "+speedLimit);
    }
}
class Splender extends Bike{
    private int speedLimit=100;
    void run(){
        System.out.println("Speed limit of Splender is "+speedLimit);
    }
}