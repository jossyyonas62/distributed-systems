import java.awt.*; 
import javax.swing.*; 
public class Mains extends JFrame{ 
public static void main (String args[]) 
{ 
 
JFrame frame = new JFrame("FlowLayout"); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.getContentPane().setLayout(new FlowLayout()); 
JButton b1 = new JButton("Hello"); 
frame.getContentPane().add(b1); 
JButton b2 = new JButton("Two"); 
frame.getContentPane().add(b2); 
JTextField t1 = new JTextField("Text here"); 
frame.getContentPane().add(t1); 
frame.pack(); 
frame.setVisible(true);  
}
}