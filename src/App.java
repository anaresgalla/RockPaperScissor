import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        // invoke later allows the gui to be created and updated in a thread-safe way
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // instantiate a RockPaperScissor obj
                RockPaperScissorGUI rockPaperScissorGUI = new RockPaperScissorGUI();

                // display the gui
                rockPaperScissorGUI.setVisible(true);
            }
        });
    }
}