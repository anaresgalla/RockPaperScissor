// frontend class

import javax.swing.*;
import java.awt.*;

public class RockPaperScissorGUI extends JFrame {

    // player buttons
    JButton rockButton, paperButton, scissorButton;

    public RockPaperScissorGUI(){
        // invoke jframe constructor and add title to the GUI
        super("Rock Paper Scissor");

        // set size of the GUI
        setSize(450, 574);

        // set layout to null to disable layout management, so we can use absolute positioning for the elements
        // i.e. setting x, y, coordinates and width/height values
        setLayout(null);

        // terminate the java virtual machine when closing the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // load GUI in the center of the screen every time we run the application
        setLocationRelativeTo(null);

        // add gui components (with a helper method so the code is cleaner)
        addGuiComponents();
    }

    private void addGuiComponents(){
        // create computer score label
        JLabel computerScoreLabel = new JLabel("Computer: 0");

        // set x, y coordinates and width/height values:
        computerScoreLabel.setBounds(0, 43, 450, 30);

        // set the font properties
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        // place the text in the center
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // add to GUI
        add(computerScoreLabel);

        // create computer choice display
        JLabel computerChoice = new JLabel("?"); // so it shows ? every new match
        computerChoice.setBounds(175, 118, 98, 81);
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
        // put a border aroud the box
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        // create player score label
        JLabel playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(0, 317, 450, 30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        // add player buttons for rock, paper, scissor
        // rock button
        rockButton = new JButton("Rock");
        rockButton.setBounds(40, 387, 105, 81);
        rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(rockButton);
        // paper button
        paperButton = new JButton("Paper");
        paperButton.setBounds(165, 387, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(paperButton);
        // scissor button
        scissorButton = new JButton("Scissors");
        scissorButton.setBounds(290, 387, 105, 81);
        scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(scissorButton);
    }

    // displays a message dialog which will show the result of the match and a try again button to play again
    private void showDialog(String message){
        JDialog resultDialog = new JDialog(this, "Result", true);
        resultDialog.setSize(227, 124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

        // message label
        JLabel resultLabel = new JLabel(message);
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel);
    }
}
