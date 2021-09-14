import java.awt.GridBagLayout;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;


public class Shapes {

    public static JFrame window = new JFrame("Shapes");
    public static JPanel panel = new JPanel(new GridBagLayout());

    public static void main(String[] args)     {

        window.setBounds(0, 0,300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(panel);
        MApp m = new MApp();
        m.setBounds(100,100,100,100);
        window.add(m);

        Draw d = new Draw(panel) ;
        d.setBounds(0, 0, window.getWidth(), 90);
        window.add(d);

        window.setVisible(true);
    }

}
