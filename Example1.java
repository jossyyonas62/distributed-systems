import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example1 extends JFrame implements ActionListener {

    JButton button;

    public Example1() {
        button = new JButton("Click Me");
        add(button);

        button.addActionListener(this);

        setSize(200,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new Example1();
    }
}