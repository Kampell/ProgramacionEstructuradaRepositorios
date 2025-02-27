import javax.swing.*;

public class CalculoTriangulo {
    public static void main(String[] args) {
        //definicion de variables
        int base = 0;
        int altura =0;
        int resultado =0;

        base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base de tu triangulo"));

        altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura de tu triangulo"));

        resultado = base * altura / 2;

        JOptionPane.showMessageDialog(null,"EL AREA DE TU TRIANGULO ES " + resultado);






    }
}
