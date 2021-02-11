package interfaza;




import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.net.http.WebSocket;

public class interfaz8 extends JFrame {

    private JButton boton1;
    private JLabel label;
    interfaz8(){
        setLayout(new FlowLayout());
        boton1= new JButton("pulsa");
        label= new JLabel("pulsaciones:0");
        add(boton1);
        add(label);
        boton1.addActionListener(new ListenerBoton());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        interfaz8 v6= new interfaz8();
    }

    private class ListenerBoton implements ActionListener {
        private
        int contador;
        @Override
        public void actionPerformed(ActionEvent e) {
            contador++;
            label.setText("pulsaciones:"+contador);
        }
    }
}
