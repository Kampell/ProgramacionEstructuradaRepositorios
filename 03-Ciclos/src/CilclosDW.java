import javax.swing.*;

public class CilclosDW {
    public static void main(String[] args) {
        // Declaración de variables
        boolean continuar = true;
        String despedida = "Gracias por usar el menú";

        // Menú principal
        while (continuar) {
            int seleccion = mostrarMenu();

            if (seleccion == 8 || seleccion == -1) {
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
                new Object[]{"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Salir"},
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
            case 7:
                Problema8();
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
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        int i = 0;
        while (i < n) {
            double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + (i + 1) + ":"));
            double venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la primera venta:"));
            double venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la segunda venta:"));
            double venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tercera venta:"));
            double comision = (venta1 + venta2 + venta3) * 0.10;
            double sueldoTotal = sueldoBase + comision;
            JOptionPane.showMessageDialog(null, "El vendedor " + (i + 1) + " obtendrá $" + comision + " por comisiones y $" + sueldoTotal + " en total.");
            i++;
        }
    }

    // Ejercicio 2
    public static void Problema2() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de obreros:"));
        int i = 0;
        while (i < n) {
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el obrero " + (i + 1) + ":"));
            double salario;
            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * 20;
            } else {
                salario = 40 * 20 + (horasTrabajadas - 40) * 25;
            }
            JOptionPane.showMessageDialog(null, "El salario del obrero " + (i + 1) + " es $" + salario);
            i++;
        }
    }

    // Ejercicio 3
    public static void Problema3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        int i = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + (i + 1) + " (M/F):");
            if (genero.equalsIgnoreCase("M")) {
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                mujeres++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Hay " + hombres + " hombres y " + mujeres + " mujeres.");
    }

    // Ejercicio 4
    public static void Problema4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos:"));
        int i = 0;
        int amarilla = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;
        while (i < n) {
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del auto " + (i + 1) + ":"));
            if (digito == 1 || digito == 2) {
                amarilla++;
            } else if (digito == 3 || digito == 4) {
                rosa++;
            } else if (digito == 5 || digito == 6) {
                roja++;
            } else if (digito == 7 || digito == 8) {
                verde++;
            } else if (digito == 9 || digito == 0) {
                azul++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Calcomanías: Amarilla: " + amarilla + ", Rosa: " + rosa + ", Roja: " + roja + ", Verde: " + verde + ", Azul: " + azul);
    }

    // Ejercicio 5
    public static void Problema5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double suma = 0;
        while (i < n) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            i++;
        }
        double promedio = suma / n;
        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es " + promedio);
    }

    // Ejercicio 6
    public static void Problema6() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double sumaHombres = 0;
        double sumaMujeres = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + (i + 1) + " (M/F):");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + (i + 1) + ":"));
            if (genero.equalsIgnoreCase("M")) {
                sumaHombres += edad;
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                sumaMujeres += edad;
                mujeres++;
            }
            i++;
        }
        double promedioHombres = sumaHombres / hombres;
        double promedioMujeres = sumaMujeres / mujeres;
        double promedioTotal = (sumaHombres + sumaMujeres) / n;
        JOptionPane.showMessageDialog(null, "Promedio de edades: Hombres: " + promedioHombres + ", Mujeres: " + promedioMujeres + ", Total: " + promedioTotal);
    }

    // Ejercicio 7
    public static void Problema7() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double menor = Double.MAX_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero < menor) {
                menor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El menor valor es " + menor);
    }

    // Ejercicio 8
    public static void Problema8() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double mayor = Double.MIN_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero > mayor) {
                mayor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor valor es " + mayor);
    }
}