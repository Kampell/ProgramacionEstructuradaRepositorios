import javax.swing.*;

public class PromedioCalificaciones {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "CALCULO DE PROMEDIO CALIFICACIONES ");


        double calificacion1 = 0;
        double calificacion2 = 0;
        double calificacion3 = 0;
        double calificacion4 = 0;
        double resultadoC = 0;
        double ResultadoF = 0;


        calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 1 "));
        calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 2 "));
        calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 3 "));
        calificacion4 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 4 "));

        resultadoC = calificacion1 + calificacion2 + calificacion3 + calificacion4;

        ResultadoF = resultadoC / 2;

        JOptionPane.showMessageDialog(null, "EL PROMEDIO DE LAS CALIFICACIONES ES" + ResultadoF);











    }
}
