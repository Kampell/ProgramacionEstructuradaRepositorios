import javax.swing.*;

public class EjercicisCF {
    public static void main(String[] args) {
        // Declaración de variables
        boolean continuar = true;
        String despedida = "Gracias por usar el menú";

        // Menú principal
        while (continuar) {
            int seleccion = mostrarMenu();

            if (seleccion == 7 || seleccion == -1) {
                JOptionPane.showMessageDialog(null, despedida);
                break;
            }

            ejecutarOpcion(seleccion);

            // Preguntar si desea volver al menú
            continuar = preguntarContinuar(despedida);
        }
    }

    // Método para mostrar el menú y obtener la selección del usuario
    public static int mostrarMenu() {
        return JOptionPane.showOptionDialog(
                null,
                "Menú de ejercicios de los Problemas Propuestos sobre bucles \n\nSelecciona una opción",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[]{
                        "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4",
                        "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Salir"
                },
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion) {
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
            case 3:
                Problema4();
                break;
            case 4:
                Problema5();
                break;
            case 5:
                Problema6();
                break;
            case 6:
                Problema7();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }

    // Método para preguntar si desea volver al menú
    public static boolean preguntarContinuar(String despedida) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (respuesta != 0) {
            JOptionPane.showMessageDialog(null, despedida);
            return false;
        }
        return true;
    }

    // Ejercicio 1
    public static void Problema1() {
        int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        double suma = 0;
        for (int i = 0; i < calif; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":"));
            suma += calificacion;
        }
        double promedio = suma / calif;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }

    // Ejercicio 2
    public static void Problema2() {
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        double suma = 0;
        double calificacionMinima = 100;
        for (int i = 0; i < alumnos; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            if (calificacion < calificacionMinima) {
                calificacionMinima = calificacion;
            }
        }
        double promedio = suma / alumnos;
        JOptionPane.showMessageDialog(null,
                "El promedio es: " + promedio + "\nLa calificación más baja es: " + calificacionMinima);
    }

    // Ejercicio 3
    public static void Problema3() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la tabla de multiplicar:"));
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Ejercicio 4
    public static void Problema4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int countNinos = 0, countJovenes = 0, countAdultos = 0, countViejos = 0;

        for (int i = 0; i < n; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + (i + 1) + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona " + (i + 1) + ":"));

            if (edad <= 12) {
                sumaNinos += peso;
                countNinos++;
            } else if (edad <= 29) {
                sumaJovenes += peso;
                countJovenes++;
            } else if (edad <= 59) {
                sumaAdultos += peso;
                countAdultos++;
            } else {
                sumaViejos += peso;
                countViejos++;
            }
        }

        double promedioNinos = countNinos == 0 ? 0 : sumaNinos / countNinos;
        double promedioJovenes = countJovenes == 0 ? 0 : sumaJovenes / countJovenes;
        double promedioAdultos = countAdultos == 0 ? 0 : sumaAdultos / countAdultos;
        double promedioViejos = countViejos == 0 ? 0 : sumaViejos / countViejos;

        JOptionPane.showMessageDialog(null, "Promedio de peso:\nNiños: " + promedioNinos + "\nJóvenes: " + promedioJovenes + "\nAdultos: " + promedioAdultos + "\nViejos: " + promedioViejos);
    }

    // Ejercicio 5
    public static void Problema5() {
        double precioPorKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilo de naranjas:"));
        double totalTienda = 0;

        for (int i = 1; i <= 15; i++) {
            double kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos de naranjas del cliente " + i + ":"));
            double totalCliente = kilos * precioPorKilo;
            if (kilos > 10) {
                totalCliente *= 0.85;
            }
            totalTienda += totalCliente;
            JOptionPane.showMessageDialog(null, "El cliente " + i + " debe pagar: " + totalCliente);
        }

        JOptionPane.showMessageDialog(null, "La tienda percibirá un total de: " + totalTienda);
    }

    // Ejercicio 6
    public static void Problema6() {
        double suma = 0;
        double minContaminacion = 100;
        double maxContaminacion = 0;

        for (int i = 1; i <= 25; i++) {
            double puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil " + i + ":"));
            suma += puntos;
            if (puntos < minContaminacion) {
                minContaminacion = puntos;
            }
            if (puntos > maxContaminacion) {
                maxContaminacion = puntos;
            }
        }

        double promedio = suma / 25;
        JOptionPane.showMessageDialog(null,
                "Promedio de puntos de contaminantes: " + promedio + "\nMenor contaminación: "
                        + minContaminacion + "\nMayor contaminación: " + maxContaminacion);
    }

    // Ejercicio 7
    public static void Problema7() {
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad " + i + ":"));
            suma += cantidad;
        }
        JOptionPane.showMessageDialog(null, "La suma de las diez cantidades es: " + suma);
    }
}