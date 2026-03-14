//Swing sample Program 
import java.awt.*; 
import javax.swing.*; 
public class Main extends JFrame { 
JLabel myLabel = new JLabel("Hello, World!"); 
public Main() { 
super("Wel-Come to Java GUI"); 
setSize(300, 100); 
getContentPane().add(myLabel); 
setDefaultCloseOperation(EXIT_ON_CLOSE); 
setVisible(true); 
} 
public static void main (String args[]) { 
Main m = new Main(); 
} 

}