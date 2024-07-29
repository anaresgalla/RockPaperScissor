// frontend class

import javax.swing.*;

public class RockPaperScissorGUI extends JFrame {
    public RockPaperScissorGUI(){
        // invoke jframe constructor and add title to the GUI
        super("Rock Paper Scissor");

        // set size of the GUI
        setSize(450, 574);

        // set layout to null to disable layout management, so we can use absolute positioning for the elements
        // i.e. setting x, y, coordinates and width/height values
        setLayout(null);

        // load GUI in the center of the screen every time we run the application
        setLocationRelativeTo(null);
    }
}
