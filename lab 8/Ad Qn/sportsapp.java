
/*Write a java program to create an interface called "sports" with methods
getNumberOfGoals and dispTeam. Create classes Hockey and football that uses the
interface "sports". Write the appropriate code for the methods to display the goals
and the wining team considering at least two teams.*/
// Define the Sports interface
interface Sports {
    void getNumberOfGoals(); // Method to get the number of goals

    void dispTeam(); // Method to display the winning team
}

// Hockey class implementing the Sports interface
class Hockey implements Sports {
    private int team1Goals;
    private int team2Goals;

    public Hockey(int team1Goals, int team2Goals) {
        this.team1Goals = team1Goals;
        this.team2Goals = team2Goals;
    }

    @Override
    public void getNumberOfGoals() {
        System.out.println("Hockey: Team 1 Goals: " + team1Goals);
        System.out.println("Hockey: Team 2 Goals: " + team2Goals);
    }

    @Override
    public void dispTeam() {
        if (team1Goals > team2Goals) {
            System.out.println("Hockey: Team 1 is the winning team!");
        } else if (team2Goals > team1Goals) {
            System.out.println("Hockey: Team 2 is the winning team!");
        } else {
            System.out.println("Hockey: It's a tie!");
        }
    }
}

// Football class implementing the Sports interface
class Football implements Sports {
    private int teamAGoals;
    private int teamBGoals;

    public Football(int teamAGoals, int teamBGoals) {
        this.teamAGoals = teamAGoals;
        this.teamBGoals = teamBGoals;
    }

    @Override
    public void getNumberOfGoals() {
        System.out.println("Football: Team A Goals: " + teamAGoals);
        System.out.println("Football: Team B Goals: " + teamBGoals);
    }

    @Override
    public void dispTeam() {
        if (teamAGoals > teamBGoals) {
            System.out.println("Football: Team A is the winning team!");
        } else if (teamBGoals > teamAGoals) {
            System.out.println("Football: Team B is the winning team!");
        } else {
            System.out.println("Football: It's a tie!");
        }
    }
}

public class sportsapp {
    public static void main(String[] args) {
        Hockey hockeyGame = new Hockey(3, 2);
        Football footballGame = new Football(2, 2);

        System.out.println("Hockey Game:");
        hockeyGame.getNumberOfGoals();
        hockeyGame.dispTeam();

        System.out.println("Football Game:");
        footballGame.getNumberOfGoals();
        footballGame.dispTeam();
    }
}
