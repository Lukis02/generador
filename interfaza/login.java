package interfaza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;
public class login extends JFrame {
    private JLabel usuario;
    private JLabel contraseña;
    private JButton submit;
    login(){
        setLayout(new FlowLayout());

        usuario= new JLabel("introduce tu usuario");
        contraseña = new JLabel("introduce la contraseña");
        submit=new JButton("login");
        add(submit);
        add(usuario);
        add(contraseña);
        submit.addActionListener(new ListenerBoton());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        login lg=new login();
    }
    private class ListenerBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
