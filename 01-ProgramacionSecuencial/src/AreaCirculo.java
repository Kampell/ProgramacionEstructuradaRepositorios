import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        //Definicion de variables
        Double valorPI = 3.1416;
        double AreaCirculo = 0.0;

        String salida = "";AreaCirculo = Integer.parseInt(JOptionPane.showInputDialog("introduce el area del circulo "));
;
        double area = valorPI * Math.pow(AreaCirculo,2);

        JOptionPane.showMessageDialog(null,"el area del circulo es " + area);







    }
}
