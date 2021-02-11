package interfaza;

import java.awt.*;

public class ventana3 extends Frame {
    private Button b1,b2,b3,b4,b5,b6;

public ventana3(){
    super("esta es la ventana 3");
    setLayout(new GridLayout(3,2));
    b1=new Button("boton1");
    add(b1);
    b2=new Button("boton2");
    add(b2);
    b3=new Button("boton3");
    add(b3);
    b4=new Button("boton4");
    add(b4);
    b5=new Button("boton5");
    add(b5);
    b6=new Button("boton6");
    add(b6);

    setSize(400,400);
    setVisible(true);

}

    public static void main(String[] args) {
        ventana3 v3= new ventana3();
    }
}
