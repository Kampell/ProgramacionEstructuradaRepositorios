import javax.swing.*;

public class Ejerciciosciclosl2 {
    public static void main(String[] args) {
        // Declaración de variables
        boolean continuar = true;
        String despedida = "Gracias por usar el menú";

        // Menú principal
        do {
            int seleccion = mostrarMenu();

            if (seleccion == 8 || seleccion == -1) {
                JOptionPane.showMessageDialog(null, despedida);
                break;
            }

            ejecutarOpcion(seleccion);

            // Preguntar si desea volver al menú
            continuar = preguntarContinuar(despedida);
        } while (continuar);
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
                        "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 12",
                        "Ejercicio 13", "Ejercicio 14", "Ejercicio 15", "Ejercicio 16", "Salir"
                },
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion) {
        switch (seleccion) {
            case 0:
                ejercicio9();
                break;
            case 1:
                ejercicio10();
                break;
            case 2:
                ejercicio11();
                break;
            case 3:
                ejercicio12();
                break;
            case 4:
                ejercicio13();
                break;
            case 5:
                ejercicio14();
                break;
            case 6:
                ejercicio15();
                break;
            case 7:
                ejercicio16();
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

    // Ejercicio 9
    public static void ejercicio9() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int factorial = calcularFactorial(n);
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }

    // Método para calcular el factorial
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Ejercicio 10
    public static void ejercicio10() {
        String impares = obtenerImpares();
        JOptionPane.showMessageDialog(null, "Números impares entre 0 y 100: " + impares);
    }

    // Método para obtener números impares entre 0 y 100
    public static String obtenerImpares() {
        String impares = "";
        for (int i = 1; i < 100; i += 2) {
            impares += i + " ";
        }
        return impares;
    }

    // Ejercicio 11
    public static void ejercicio11() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int suma = calcularSumaAntecesores(n);
        JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + n + " es: " + suma);
    }

    // Método para calcular la suma de los números que anteceden a n
    public static int calcularSumaAntecesores(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            suma += i;
        }
        return suma;
    }

    // Ejercicio 12
    public static void ejercicio12() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        boolean esPrimo = esNumeroPrimo(n);
        JOptionPane.showMessageDialog(null, n + (esPrimo ? " es primo" : " no es primo"));
    }

    // Método para determinar si un número es primo
    public static boolean esNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Ejercicio 13
    public static void ejercicio13() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de valores:"));
        int sumaPositivos = 0;
        int productoNegativos = 1;
        for (int i = 0; i < n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                productoNegativos *= numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma de positivos: " + sumaPositivos + "\nProducto de negativos: " + productoNegativos);
    }

    // Ejercicio 14
    public static void ejercicio14() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double suma = calcularSerie14(n, x);
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }

    // Método para calcular la serie del ejercicio 14
    public static double calcularSerie14(int n, int x) {
        double suma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 3) {
            suma += Math.pow(x, 3) / (3 * i) / j;
        }
        return suma;
    }

    // Ejercicio 15
    public static void ejercicio15() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double suma = calcularSerie15(n, x);
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }

    // Método para calcular la serie del ejercicio 15
    public static double calcularSerie15(int n, int x) {
        double suma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 3) {
            if (i % 2 == 0) {
                suma -= Math.pow(x, 3) / (3 * i) / j;
            } else {
                suma += Math.pow(x, 3) / (3 * i) / j;
            }
        }
        return suma;
    }

    // Ejercicio 16
    public static void ejercicio16() {
        String numeros = obtenerNumerosDel1000Al0();
        JOptionPane.showMessageDialog(null, "Números del 1000 al 0: " + numeros);
    }

    // Método para obtener números del 1000 al 0
    public static String obtenerNumerosDel1000Al0() {
        String numeros = "";
        for (int i = 1000; i >= 0; i--) {
            numeros += "\n" + i;
        }
        return numeros;
    }
}