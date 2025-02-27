import javax.swing.*;

public class Controlcalificaciones2 {
    public static void main(String[] args) {
        //declaracion de variables
        // Declaración e inicialización de la variable
        double calif = 0.0;

        // Solicitar datos al usuario
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificación"));

        // Verificar si la calificación es válida
        if (calif < 0 || calif > 10) {
            JOptionPane.showMessageDialog(null, "La calificación no es válida");
        } else {
            // Verificar si el estudiante está aprobado
            if (calif >= 7.0) {
                JOptionPane.showMessageDialog(null, "Estás aprobado");
            }
        }

        // Mostrar mensaje de fin del programa
        JOptionPane.showMessageDialog(null, "Fin del programa");
    }
}
