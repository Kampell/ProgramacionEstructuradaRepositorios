import javax.swing.*;

public class numeroimpar {
    public static void main(String[] args) {


        //declaracion de variables
        int num = 0;

        //solicitar datos
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));

        //Proceso
        if (num % 2 == 0) {

            //salida 1
            JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
        } else {

            //salida 2
            JOptionPane.showMessageDialog(null, "El numero " + num + " es inpar");
        }
    }}