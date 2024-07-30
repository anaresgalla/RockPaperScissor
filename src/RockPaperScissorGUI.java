// frontend class

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorGUI extends JFrame implements ActionListener{

    // player buttons
    JButton rockButton, paperButton, scissorButton;

    // will display the computer choice
    JLabel computerChoice;

    // will display the score of the computer and of the player
    JLabel computerScoreLabel, playerScoreLabel;

    // backend object
    RockPaperScissor rockPaperScissor;

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

        // initialize the backend obj
        rockPaperScissor = new RockPaperScissor();

        // add gui components (with a helper method so the code is cleaner)
        addGuiComponents();
    }

    private void addGuiComponents(){
        // create computer score label
        computerScoreLabel = new JLabel("Computer: 0");

        // set x, y coordinates and width/height values:
        computerScoreLabel.setBounds(0, 43, 450, 30);

        // set the font properties
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        // place the text in the center
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // add to GUI
        add(computerScoreLabel);

        // create computer choice display
        computerChoice = new JLabel("?"); // so it shows ? every new match
        computerChoice.setBounds(175, 118, 98, 81);
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
        // put a border aroud the box
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerChoice);

        // create player score label
        playerScoreLabel = new JLabel("Player: 0");
        playerScoreLabel.setBounds(0, 317, 450, 30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        // add player buttons for rock, paper, scissor
        // rock button
        rockButton = new JButton("Rock");
        rockButton.setBounds(40, 387, 105, 81);
        rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        // adding this to the action listener, the gui class is responsible
        // for handling what happens when the buttons are pressed
        rockButton.addActionListener(this);
        add(rockButton);

        // paper button
        paperButton = new JButton("Paper");
        paperButton.setBounds(165, 387, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        paperButton.addActionListener(this);
        add(paperButton);

        // scissor button
        scissorButton = new JButton("Scissors");
        scissorButton.setBounds(290, 387, 105, 81);
        scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        scissorButton.addActionListener(this);
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
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        // try again button
        JButton tryAgainButton = new JButton("Try Again");
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // reset computer choice
                computerChoice.setText("?");

                // close the dialog box
                resultDialog.dispose();
            }
        });
        resultDialog.add(tryAgainButton, BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get player choice
        String playerChoice = e.getActionCommand().toString();

        // play rock paper scissors and store the result in a string var
        String result = rockPaperScissor.playRockPaperScissor(playerChoice);

        // load computer choice
        computerChoice.setText(rockPaperScissor.getComputerChoice());

        // update the scores
        computerScoreLabel.setText("Computer: " + rockPaperScissor.getComputerScore());
        playerScoreLabel.setText("Player: " + rockPaperScissor.getPlayerScore());

        // display the result dialog in the end
        showDialog(result);
    }
}
