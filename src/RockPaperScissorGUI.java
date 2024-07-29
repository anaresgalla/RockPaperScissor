// frontend class

import javax.swing.*;
import java.awt.*;

public class RockPaperScissorGUI extends JFrame {
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
    }
}
