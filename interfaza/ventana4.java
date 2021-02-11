package interfaza;

import javax.swing.*;
import java.awt.*;

public class ventana4 extends JFrame {

    private JButton b1,b2,b3;

    public ventana4(){
        super("esta es la ventana1");
        setLayout(new FlowLayout());

        b1=new JButton("boton1");
        add(b1);
        b2=new JButton("boton2");
        add(b2);
        b3=new JButton("boton3");
        add(b3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ventana4 v4= new ventana4();
    }
}
