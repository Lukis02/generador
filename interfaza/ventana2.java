package interfaza;

import java.awt.*;

public class ventana2 extends Frame {
    private Button bNorte,bSur,bEste,bOeste,bCentro;

    public ventana2(){
        super("esta es la ventana2");
        setLayout(new BorderLayout());
        bNorte=new Button("norte");
        add(bNorte,BorderLayout.NORTH);
        bSur=new Button("sur");
        add(bSur,BorderLayout.SOUTH);
        bEste=new Button("este");
        add(bEste,BorderLayout.EAST);
        bOeste=new Button("oeste");
        add(bOeste,BorderLayout.WEST);
        bCentro=new Button("centro");
        add(bCentro,BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ventana2 v2= new ventana2();
    }
}
