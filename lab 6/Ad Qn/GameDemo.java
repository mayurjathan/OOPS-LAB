import java.util.Scanner;
public class GameDemo{
    public static void main(String[] args) {
        Game game;
        var s = new Scanner(System.in);
        System.out.print("Enter a game: (cricket/chess) ");
        String gameChoice = s.next();
        if(gameChoice.equals("cricket"))
            game = new Cricket();
        else if(gameChoice.equals("chess"))
            game = new Chess();
        else game = new Game();
        game.type();
    }
}

class Game{
    void type(){
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game{
    void type(){
        System.out.println("Cricket is an outdoor game.");
    }
}
class Chess extends Game{
    void type(){
        System.out.println("Chess is an indoor game.");
    }
}