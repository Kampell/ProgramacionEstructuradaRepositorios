import javax.naming.RefAddr;
import javax.swing.*;

public class CalculadoraRadio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"PROGRAMA QUE CALCULA LA SALIDA DEL PERIMETRO Y EL AREA DE UN CIRCULO CON UN RADIO DE 3.2 PULGADAS");
//declaracion de variables

        double radio = 3.2;
        double PI = 3.1416;
        double perimetro = 2*PI*radio;
        double area = PI*Math.pow(radio,2);

//salida
        JOptionPane.showMessageDialog(null,"el perimetro del circulo es " + perimetro + " pulgadas");
        JOptionPane.showMessageDialog(null,"El area del circulo es " + area + " pulgadas cuadradas");


























    }
}
