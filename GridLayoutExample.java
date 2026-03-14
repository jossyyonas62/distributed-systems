import java.awt.*; 
import javax.swing.*; 
public class GridLayoutExample extends JFrame{ 
public static void main (String args[]) 
{ 
JFrame frame = new JFrame("GridLayout"); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.getContentPane().setLayout(new GridLayout(4,3,5,5)); 
for (int i=0; i<10; i++) 
frame.getContentPane().add(new JButton(""+i)); 
frame.pack(); 
frame.setVisible(true); 
} 
}