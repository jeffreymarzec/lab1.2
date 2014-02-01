package DemoWindow;

// Name: Jeffrey Marzec
// Lab/task: Lab1.2
// Date: 2/1/14

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YellowListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
        YellowWindow w = new YellowWindow();
        w.setVisible(true);
    }
}
