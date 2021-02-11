package interfaza;
import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class generador extends JFrame {
    public static String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    public static String MAYUSCULAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public static String numeros = "1234567890";
    public static String ASCII = "()!·$%&/=¿?/*-+";
    public generador() {
        super("Generador de contraseñas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1, 50, 50));
        p1.add(new JTextField());
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,1));
        p3.add(new JCheckBox());
        p3.add(new JCheckBox());
        p3.add(new JCheckBox());
        p3.add(new JCheckBox());
        p2.add(p3);
        p2.add(new JSpinner());
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(1,2));
        p4.add(new JButton());
        p4.add(new JButton());
        p1.add(p2);
        p1.add(p4);
add(p1);
        setSize(400,400);
        setVisible(true);
        }

        public static void main(String[] args) {
            generador gn= new generador();

        }
        private class ListenerBoton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        }}