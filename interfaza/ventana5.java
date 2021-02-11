package interfaza;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class ventana5 extends JFrame {
    public ventana5() {
        super("esta es la ventana 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 50, 50));
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("" + 0));
        p1.add(new JButton("start"));
        p1.add(new JButton("stop"));
        p1.add(new JButton("reset"));
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("aqui va el tiempo"), BorderLayout.NORTH);

        p2.add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.EAST);
        add(new JButton("aqui va la comida"), BorderLayout.CENTER);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ventana5 v5= new ventana5();
    }
}
