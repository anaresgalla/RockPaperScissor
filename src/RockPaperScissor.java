import java.util.Random;

// backend class to handle all the logic
public class RockPaperScissor {
    // all the choices the computer can choose from
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    // store the computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    // generates a random number to randomly choose an option for the computer
    private Random random;

    // constructor - to initialize random obj
    public RockPaperScissor(){
        random = new Random();
    }

    // call this method to begin playing rock paper scissors
    // playerChoice is the choice made by the player (rock, paper, scissors)
    // this method will return the result of the game (computer wins, player wins, draw)
    // it will be connected to the frontend, since the player choice will come from there
    public String playRockPaperScissor(String playerChoice){
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];
    }


}
