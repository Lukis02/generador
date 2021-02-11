package interfaza;

import java.awt.*;

public class calculadora extends Frame {
  private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,suma,resta,multiplicar,dividir,igual;
public calculadora(){
super("calculadora");
    setLayout(new GridLayout(4,4));
    b7=new Button("7");
    add(b7);
    b8=new Button("8");
    add(b8);
    b9=new Button("9");
    add(b9);
    dividir=new Button("/");
    add(dividir);
    b4=new Button("4");
    add(b4);
    b5=new Button("5");
    add(b5);
    b6=new Button("6");
    add(b6);
    resta=new Button("-");
    add(resta);
    b1=new Button("1");
    add(b1);
    b2=new Button("2");
    add(b2);
    b3=new Button("3");
    add(b3);
    suma=new Button("+");
    add(suma);
    multiplicar=new Button("x");
    add(multiplicar);
    b0=new Button("0");
    add(b0);
    igual=new Button("=");
    add(igual);
    setSize(400,400);
    setVisible(true);

}

    public static void main(String[] args) {
        calculadora cl=new calculadora();
    }
}
