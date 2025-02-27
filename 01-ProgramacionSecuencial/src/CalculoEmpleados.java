import javax.swing.*;

public class CalculoEmpleados {
    public static void main(String[] args) {
        //declaracion de variables
        int HorasTrabajadas = 0;
        double Cuotahora =  0.0;
        String nombre = "";
        double sueldo = 0;


        //solicitud datos

        nombre = JOptionPane.showInputDialog("ingrese el nombre del empleado:");

        HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("introduce las horas trabajadas :"));

        Cuotahora = Double.parseDouble(JOptionPane.showInputDialog("introduce la cuota por hora : "));

        sueldo =HorasTrabajadas * Cuotahora;

        JOptionPane.showMessageDialog(null,"EL TRABAJADOR  " + nombre + " TUVO UN SUELDO DE  " + sueldo + " EN TOTAL ");









    }
}
