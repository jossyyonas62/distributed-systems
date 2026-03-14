import java.awt.*;

publi {
    public static void main(String[] args) {

        Frame frame = new Frame("AWT Example");

        Button button = new Button("Click Me");

        frame.add(button);

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}