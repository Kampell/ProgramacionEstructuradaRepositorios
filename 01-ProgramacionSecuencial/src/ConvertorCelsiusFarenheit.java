import javax.swing.*;

public class ConvertorCelsiusFarenheit {
    public static void main(String[] args) {

        //declaracion variables
        double valorCelsius = 0;
        double valor1 = 9.0 / 5.0;
        valorCelsius  = Double.parseDouble(JOptionPane.showInputDialog("introduce los celcius a convertir "));
        double farenheit = 0;

        farenheit = valor1 * valorCelsius + 32;
JOptionPane.showMessageDialog(null,"el resultado de la conversion de" + valorCelsius + "celsius" + " es " + farenheit + "farenheit");
        }}