package DemoWindow;

// Name: Jeffrey Marzec
// Lab/task: Lab1.2
// Date: 2/1/14

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

public class ColorWindow
{
    public static final int WIDTH = 500; 
    public static final int HEIGHT = 200;

    public ColorWindow()
    {
        JFrame frame = new JFrame("Question");
        Container panel = frame.getContentPane();
        
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        JButton redButton = new JButton("What is the color of hearts and "
                + "diamonds?");
        redButton.addActionListener(new RedListener());
        panel.add(redButton, BorderLayout.NORTH);
        
        JButton yellowButton = new JButton("What is the color of bananas and "
                + "lemons?");
        yellowButton.addActionListener(new YellowListener());
        panel.add(yellowButton, BorderLayout.SOUTH);
 
        JLabel label = new JLabel("Pick a question.", JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
    }
}