
import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class generador extends JFrame {
    private boolean MINUS, MAYUS, NUMS, ASCIS;
     ArrayList array= new ArrayList();
    public static String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    public static String MAYUSCULAS = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public static String numeros = "1234567890";
    public static String ASCII = "()!·$%&/=¿?/*-+";
    private static JSpinner spino;
    private static JTextField texto;
    private static JButton aceptar, reiniciar;
    private static JCheckBox mayus, minus, num, ascii;
    private SpinnerModel digitos = new SpinnerNumberModel(4, 4, 15, 1);

    public generador() {
        super("Generador de contraseñas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1, 50, 50));
        texto = new JTextField();
        p1.add(texto);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 2));
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4, 1));
        mayus = new JCheckBox("Mayúsculas (ABCDEFGHIJKLMNÑOPQRSTUVWXYZ)");
        p3.add(mayus);
        minus = new JCheckBox("minusculas (abcdefghijklmnñopqrstuvwxyz)");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (minus.isSelected() == true) {
                    MINUS = true;
                } else {
                    MINUS = false;
                }
            }
        });
        p3.add(minus);
        num = new JCheckBox("números(1234567890)");
        p3.add(num);
        ascii = new JCheckBox("caracteres ASCII (!·$%&/=¿?/*-+)");
        p3.add(ascii);
        p2.add(p3);
        spino = new JSpinner(digitos);

        p2.add(spino);
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(1, 2));
        reiniciar = new JButton("reiniciar");
        p4.add(reiniciar);
        reiniciar.addActionListener(new reinicio());
        aceptar = new JButton("aceptar");
        p4.add(aceptar);
        aceptar.addActionListener(new acepto());

        p1.add(p2);
        p1.add(p4);
        add(p1);
        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        generador gn = new generador();
    }


    private class minus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {



        }
    }

    private class mayus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (mayus.isSelected() == true) {
                MINUS = true;
            } else {
                MINUS = false;
            }
        }
    }

    private class num implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            if (num.isSelected() == true) {
                NUMS = true;
            } else {
                NUMS = false;
            }
        }
    }

    private class ascii implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (ascii.isSelected() == true) {
                ASCIS = true;
            } else {
                ASCIS = false;
            }
        }
    }

    private class acepto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (MINUS == true) {
                for (int i = 'a'; i <= 'z'; i++) {
                    array.add(i);
                }
            }
            if (MAYUS == true) {
                for (int i = 'A'; i <= 'Z'; i++) {
                    array.add(i);
                }
            }
            if (NUMS == true) {
                for (int i = '0'; i <= '9'; i++) {
                    array.add(i);
                }            }
            if (ASCIS == true) {
                for (int i = '('; i <= '+'; i++) {
                    array.add(i);
                }

            }
            int numcarac = (int) digitos.getValue();
            String contraseña = " ";
            Random contra = new Random();
            for (int i = 0; i <numcarac; i++) {
                contraseña += array.get(contra.nextInt(array.size()));

            }
            texto.setText(contraseña);


        }
    }


    private class reinicio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (mayus.isSelected() == true) {
                mayus.setSelected(false);
            }
            if (minus.isSelected() == true) {
                minus.setSelected(false);
            }
            if (num.isSelected() == true) {
                num.setSelected(false);
            }
            if (ascii.isSelected() == true) {
                ascii.setSelected(false);

            }
            spino.setValue(4);


        }
    }

        }




