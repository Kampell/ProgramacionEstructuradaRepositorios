import javax.swing.JOptionPane;

public class Ejercicios13 {
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
                new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3"},
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion, String despedida) {
        switch (seleccion) {
            case 0:
                Problema1();
                break;
            case 1:
                Problema2();
                break;
            case 2:
                Problema3();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
        JOptionPane.showMessageDialog(null, despedida);
    }

    // Método para el Problema 1
    public static void Problema1() {
        // Declaración de variables
        int numComp;
        double total;
        String mensajeFinal = "";

        // Solicitar datos
        numComp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de computadoras a comprar"));

        // Proceso
        if (numComp <= 0) {
            mensajeFinal = "Número de computadoras no válido";
        } else if (numComp > 2500) {
            mensajeFinal = "El número de computadoras que compraste es muy grande. Intenta ingresar un número menor.";
        } else {
            double precioBase = numComp * 11000;
            if (numComp < 5) {
                total = precioBase * 0.9;
                mensajeFinal = "El monto de las computadoras es de " + precioBase + ". Con un descuento del 10%, el monto total a pagar es de " + total;
            } else if (numComp < 10) {
                total = precioBase * 0.8;
                mensajeFinal = "El monto de las computadoras es de " + precioBase + ". Con un descuento del 20%, el monto total a pagar es de " + total;
            } else {
                total = precioBase * 0.6;
                mensajeFinal = "El monto de las computadoras es de " + precioBase + ". Con un descuento del 40%, el monto total a pagar es de " + total;
            }
        }

        // Mostrar mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }

    // Método para el Problema 2
    public static void Problema2() {
        // Declaración de variables
        int numLlan;
        String mensajeFinal = "";

        // Solicitar datos
        numLlan = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de llantas a comprar"));

        // Proceso
        if (numLlan <= 0) {
            mensajeFinal = "Número de llantas no válido";
        } else if (numLlan > 2000) {
            mensajeFinal = "Se excedió el número de llantas. Intenta con un número menor.";
        } else {
            int precioUnitario;
            if (numLlan < 5) {
                precioUnitario = 300;
            } else if (numLlan <= 10) {
                precioUnitario = 250;
            } else {
                precioUnitario = 200;
            }
            mensajeFinal = "Se compraron " + numLlan + " llantas de la marca Ponchadas. El total a pagar es de " + (numLlan * precioUnitario);
        }

        // Mostrar mensaje final
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }

    // Método para el Problema 3
    public static void Problema3() {
        // Declaración de variables
        String[] preguntas = {
                "¿Colón descubrió América?",
                "¿La independencia de México fue en el año 1810?",
                "¿The Doors fue un grupo de rock Americano?"
        };
        String[] respuestasCorrectas = {"SI", "SI", "SI"};
        String mensajeFinal = "Respuesta errónea. Gracias por participar.";

        // Proceso de preguntas
        for (int i = 0; i < preguntas.length; i++) {
            int respuesta = JOptionPane.showOptionDialog(
                    null,
                    "Pregunta " + (i + 1) + "\n\n" + preguntas[i],
                    "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new Object[] {"SI", "NO"},
                    null
            );

            if (respuesta != 0 || !respuestasCorrectas[i].equals("SI")) {
                JOptionPane.showMessageDialog(null, mensajeFinal);
                return;
            }
        }

        // Mensaje final si todas las respuestas son correctas
        JOptionPane.showMessageDialog(null, "Todas tus respuestas son correctas. ¡Gracias por participar!");
    }
}