import javax.swing.*;

public class ValorX {
    public static void main(String[] args) {

        //declaracion de variables

        String valorY = "";

        valorY = JOptionPane.showInputDialog(null,"introduce el valor de Y"  + "Ecuación Y = 3X^2 + 7X - 15" );

        double Y = Double.parseDouble(valorY);
        double a = 3;
        double b = 7;
        double c =-15 - Y;
        double discriminante = b * b - 4 * a * c;
        double raiz1 = 0.0;
        double raiz2 =0.0;
        String resultado = "";

        raiz1 = (-b + (discriminante > 0 ? Math.pow(discriminante,0.5) : 0)) / (2* a);
        raiz2 = (-b + (discriminante > 0 ? Math.pow(discriminante,0.5) : 0)) / (2* a);

        resultado = "las soluciones de las ecuaciones son \n" + "valorX1 =" + raiz1 +"\n" + "valorX2 =" + raiz2;

        JOptionPane.showMessageDialog(null,"el resultado es  " + resultado);




    }
}
