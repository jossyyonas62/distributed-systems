import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class GUIExample1 extends JFrame { 
private JTextArea text; 
public GUIExample1 () { 
super("Wel-Come to Java GUI EVENT HANDLING DEMO"); 
setSize(300, 100); 
getContentPane().setLayout(new BorderLayout()); 
text= new JTextArea (30,40); 
getContentPane().add(text, BorderLayout.CENTER); 
JButton button= new JButton ("CHANGE TO CAPITAL"); 
getContentPane().add(button,BorderLayout.SOUTH); 
class ButtonListener implements ActionListener  
{  
public void actionPerformed(ActionEvent event)  
{  
text.setText(text.getText().toUpperCase()); 
} } 
ButtonListener listener = new ButtonListener(); 
button.addActionListener(listener); 
setVisible(true); 
} 
public static void main (String args[]) { 
GUIExample1 m = new GUIExample1 (); }}