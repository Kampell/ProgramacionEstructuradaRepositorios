import javax.swing.*;

public class CalculoExpresion {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Calcula la expresion con los siguientes valores X = 5 Y = 3");


       //declaracion variables

        int expresionX = 5;
        int expresionY = 3;
        int resultado1 = expresionY + expresionX;
        int resultado2 = expresionY-1;
        int resultadoF = resultado1 / resultado2;

        JOptionPane.showMessageDialog(null,"el resultado de la expresion es " + resultadoF);














    }
}
