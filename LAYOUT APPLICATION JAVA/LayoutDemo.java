import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame {

    public LayoutDemo () {
        setTitle("Layout Manager Demo");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //creating a tabbed pane with five different tabe
        //demonstrating the various layou managers
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Intro", new IntroPanel());
        tp.addTab("Flow", new FlowPanel());
        tp.addTab("Border", new BorderPanel());
        tp.addTab("Grid", new GridPanel());
        tp.addTab("Box", new BoxPanel());

        Container cpane = getContentPane();
        cpane.add(tp);

        setVisible(true);
    }
    public static void main (String [] args)
    {
        new LayoutDemo();
    }
}