package co.edu.uptc.views;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
    
    public Button(){

        setSize(200,100);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setAlwaysOnTop(true);

        JButton button = new JButton("Olis");
        button.setSize(200, 200);
        add(button);
    }
}
