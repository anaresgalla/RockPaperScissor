import java.util.Random;

// backend class to handle all the logic
public class RockPaperScissor {
    // all the choices the computer can choose from
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    // store the computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    // store the scores so that we can retrieve the values and display it to the frontend
    private int computerScore, playerScore;

    // generates a random number to randomly choose an option for the computer
    private Random random;

    // constructor - to initialize random obj
    public RockPaperScissor() {
        random = new Random();
    }

    // call this method to begin playing rock paper scissors
    // playerChoice is the choice made by the player (rock, paper, scissors)
    // this method will return the result of the game (computer wins, player wins, draw)
    // it will be connected to the frontend, since the player choice will come from there
    public String playRockPaperScissor(String playerChoice) {
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluates the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Scissors")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Rock")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else{
            if(playerChoice.equals("Rock")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Paper")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }
    return result;
    }

}
