import javax.swing.*;

public class CalifLetras {
    public static void main(String[] args) {


        // Declaración de variables
        double calif;
        char letra = ' ';

        // Solicitar datos
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificación"));

        // Validar si la calificación es válida
        if (calif < 0 || calif > 10) {
            JOptionPane.showMessageDialog(null, "La calificación no es válida");
            return; // Terminar el programa si la calificación no es válida
        }

        // Asignar la letra correspondiente
        if (calif >= 9) {
            letra = 'A';
        } else if (calif >= 8) {
            letra = 'B';
        } else if (calif >= 7) {
            letra = 'C';
        } else if (calif >= 6) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Tu calificación es: " + letra);

    }
}