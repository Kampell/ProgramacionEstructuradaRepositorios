import javax.swing.*;

public class Vendedor {
    public static void main(String[] args) {
        //DECLARACION VARIABLES

        double sueldobase1 = 0.0;
        double sueldobase2 = 0.0;
        double sueldobase3 = 0.0;



        sueldobase1 = Double.parseDouble(JOptionPane.showInputDialog("introduce tu sueldo del dia 1 "));
        sueldobase2 = Double.parseDouble(JOptionPane.showInputDialog("introduce tu sueldo del dia 2  "));
        sueldobase3 = Double.parseDouble(JOptionPane.showInputDialog("introduce tu sueldo del dia 3 "));

        double comision1 = (sueldobase1 / 100) * 10;
        double comision2 = (sueldobase2 / 100) * 10;
        double comision3 = (sueldobase3 / 100) * 10;

        double total = comision1 + comision2 + comision3 + sueldobase3 +sueldobase2 +sueldobase1;

        JOptionPane.showMessageDialog(null,"\npor el dia 1 es de " + comision1 +  "\n por el dia 2 es de " + comision2 + "\n por el dia 3 fue de " + comision3);

        JOptionPane.showMessageDialog(null," EL TOTAL EN TOTAL  FUE DE " + total);






    }
}
