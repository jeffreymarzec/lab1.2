package DemoWindow;

// Name: Jeffrey Marzec
// Lab/task: Lab1.2
// Date: 2/1/14

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class YellowWindow extends JFrame
{
    public static final int WIDTH = 250; 
    public static final int HEIGHT = 100;

    public YellowWindow()
    {
        super( );
        setSize(WIDTH, HEIGHT);

        setTitle("Answer");
        
        getContentPane().setBackground(Color.YELLOW);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel msg = new JLabel("Yellow", JLabel.CENTER);
        add(msg);
    }
}