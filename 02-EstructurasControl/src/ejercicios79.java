import javax.swing.*;

public class ejercicios79 {
    public static void main(String[] args) {
        // Declaración de variables
        int seleccion;
        String despedida = "Gracias por usar el menú";

        // Mostrar menú y obtener selección del usuario
        seleccion = mostrarMenu();

        // Ejecutar la opción seleccionada
        ejecutarOpcion(seleccion, despedida);
    }

    // Método para mostrar el menú y obtener la selección del usuario
    public static int mostrarMenu() {
        return JOptionPane.showOptionDialog(
                null,
                "Menú de ejercicios de los Problemas Propuestos sobre Condicionales Compuestos \n\nSelecciona una opción",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[] {"Ejercicio 7", "Ejercicio 8", "Ejercicio 9"},
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion, String despedida) {
        switch (seleccion) {
            case 0:
                Problema7();
                break;
            case 1:
                Problema8();
                break;
            case 2:
                Problema9();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
        JOptionPane.showMessageDialog(null, despedida);
    }

    // Método para el Ejercicio 7
    public static void Problema7() {
        // Declaración de variables
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad en meses o años:");
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");
        String hemoglobinaStr = JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina:");

        int edad = Integer.parseInt(edadStr);
        double hemoglobina = Double.parseDouble(hemoglobinaStr);
        boolean tieneAnemia = false;

        // Determinar si tiene anemia
        tieneAnemia = determinarAnemia(edad, sexo, hemoglobina);

        // Mostrar resultado
        mostrarResultadoAnemia(tieneAnemia);
    }

    // Método para determinar si el paciente tiene anemia
    public static boolean determinarAnemia(int edad, String sexo, double hemoglobina) {
        if (edad <= 1) {
            return hemoglobina < 13;
        } else if (edad <= 6) {
            return hemoglobina < 10;
        } else if (edad <= 12) {
            return hemoglobina < 11;
        } else if (edad <= 60) {
            return hemoglobina < 11.5;
        } else if (edad <= 120) {
            return hemoglobina < 12.6;
        } else if (edad <= 180) {
            return hemoglobina < 13;
        } else if (sexo.equalsIgnoreCase("F")) {
            return hemoglobina < 12;
        } else if (sexo.equalsIgnoreCase("M")) {
            return hemoglobina < 14;
        }
        return false;
    }

    // Método para mostrar el resultado de la anemia
    public static void mostrarResultadoAnemia(boolean tieneAnemia) {
        if (tieneAnemia) {
            JOptionPane.showMessageDialog(null, "El paciente tiene anemia.");
        } else {
            JOptionPane.showMessageDialog(null, "El paciente no tiene anemia.");
        }
    }

    // Método para el Ejercicio 8
    public static void Problema8() {
        // Declaración de variables
        String promedioStr = JOptionPane.showInputDialog("Ingrese el promedio:");
        String nivelStr = JOptionPane.showInputDialog("Ingrese el nivel (preparatoria/profesional):");
        String reprobadasStr = JOptionPane.showInputDialog("Ingrese el número de materias reprobadas (si aplica):");

        double promedio = Double.parseDouble(promedioStr);
        int reprobadas = reprobadasStr.isEmpty() ? 0 : Integer.parseInt(reprobadasStr);
        int unidades = 0;
        double descuento = 0;
        double costoPorUnidad = nivelStr.equalsIgnoreCase("preparatoria") ? 180.0 / 5 : 300.0 / 5;

        // Determinar unidades y descuento
        if (nivelStr.equalsIgnoreCase("preparatoria")) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                unidades = 50;
            } else if (promedio <= 7 && reprobadas <= 3) {
                unidades = 45;
            } else if (promedio <= 7 && reprobadas >= 4) {
                unidades = 40;
            }
        } else if (nivelStr.equalsIgnoreCase("profesional")) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.20;
            } else {
                unidades = 55;
            }
        }

        // Calcular costo total
        double costoTotal = unidades * costoPorUnidad * (1 - descuento);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El total a pagar es: $" + costoTotal);
    }

    // Método para el Ejercicio 9
    public static void Problema9() {
        // Declaración de variables
        String num1Str = JOptionPane.showInputDialog("Ingrese el primer número:");
        String num2Str = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String num3Str = JOptionPane.showInputDialog("Ingrese el tercer número:");

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int num3 = Integer.parseInt(num3Str);
        int medio = 0;

        // Determinar el número medio
        medio = determinarNumeroMedio(num1, num2, num3);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El número medio es: " + medio);
    }

    // Método para determinar el número medio
    public static int determinarNumeroMedio(int num1, int num2, int num3) {
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            return num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            return num2;
        } else {
            return num3;
        }
    }
}