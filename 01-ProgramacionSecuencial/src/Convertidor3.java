import javax.swing.*;

public class Convertidor3 {
    public static void main(String[] args) {


        //declaracion variables
        double pies = 0.0;
        pies = Double.parseDouble(JOptionPane.showInputDialog("introduce los PIES a convertir "));

        double pulgadas = pies * 12;
        double yardas = pies/3;
        double centimetros = pulgadas *2.54;
        double metros = centimetros /100.0;


    JOptionPane.showMessageDialog(null,"la longitud de " + pies + "pies es equivalente a \n" +
            yardas +
            "Yardas\n" +
            pulgadas +
            "Pulgadas\n" +
            centimetros +
            "centimetros\n"+
            metros + "metros\n");



    }
}
