package interfaza;

import javax.swing.*;
import java.awt.*;

public class grados extends JFrame {

  grados(){
      super("grados");

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new BorderLayout());

      JPanel p1= new JPanel();
      p1.setLayout(new GridLayout(1,2,5,5));
        p1.add(new JButton("Fº"));
      p1.add(new JButton("Cº"));
        add(p1,BorderLayout.CENTER);

        JPanel p2= new JPanel();
        p2.setLayout(new GridLayout(3,1));
        p2.add(new JLabel("introduce los grados"));
        p2.add(new JTextField(""));
        p2.add(p1);
      add(p2,BorderLayout.CENTER);
      setSize(400,400);
      setVisible(true);
  }



    public static void main(String[] args) {
        grados c=new grados();
    }
}
