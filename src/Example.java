import java.awt.*;
import javax.swing.*;
public class Example extends Canvas {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Canvas");
        Example ex = new Example();

        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ex);
     }
}