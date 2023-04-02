import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel{
    
    public IntroPanel(){
        setBackground(Color.green);

        JLabel lblMan = new JLabel("Layout Manager Demonstration ");
        JLabel lblExam = new JLabel ("Choose a tab to see an example of a layout manager.");

        add(lblMan);
        add(lblExam);
    }
}
