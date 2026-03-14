import java.awt.*; 
import javax.swing.*; 
public class DemoBorderLayout extends JFrame{ 
public static void main (String args[]){ 
JFrame frame = new JFrame("Border"); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.getContentPane().setLayout(new BorderLayout()); 
JButton b1 = new JButton("At the top"); 
frame.getContentPane().add(b1,BorderLayout.NORTH ); 
JButton b2 = new JButton("Bottom"); 
frame.getContentPane().add(b2,BorderLayout.SOUTH); 
JTextField t1 = new JTextField("Left"); 
frame.getContentPane().add(t1,BorderLayout.WEST); 
JTextField t2 = new JTextField("Right"); 
frame.getContentPane().add(t2,BorderLayout.EAST); 
JButton b3 = new JButton("Centre"); 
frame.getContentPane().add(b3,BorderLayout.CENTER ); 
frame.setSize(200, 120); 
frame.setVisible(true); 
}} 