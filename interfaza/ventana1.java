package interfaza;

import java.awt.*;

public class ventana1 extends Frame {
    private Button b1,b2,b3;

   public ventana1(){
       super("esta es la ventana1");
       setLayout(new FlowLayout());

       b1=new Button("boton1");
       add(b1);
       b2=new Button("boton2");
       add(b2);
       b3=new Button("boton3");
       add(b3);
       setSize(400,400);
       setVisible(true);
   }

    public static void main(String[] args) {
        ventana1 v1= new ventana1();
    }
}
