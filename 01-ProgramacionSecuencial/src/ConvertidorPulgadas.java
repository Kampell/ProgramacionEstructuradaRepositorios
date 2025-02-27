import javax.swing.*;

public class ConvertidorPulgadas {
    public static void main(String[] args) {

        Double Pulgada = 25.4;
        Double numero1 = 2.0;
        Double numero2 =5.0;
        Double numero3 = 10.0;
        Double resultado = numero1 * Pulgada;
        Double resultado2 = numero2 * Pulgada;
        Double resultado3 = numero3 * Pulgada;

        JOptionPane.showMessageDialog(null,"\nla conversion del numero 1 a pulgadas es " + resultado +"\nla conversion del numero 2 a pulgadas es " + resultado2 + "\nLa conversion del numero 2 a pulgadas es" + resultado3);




    }
}
