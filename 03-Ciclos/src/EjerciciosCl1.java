import javax.swing.*;

public class EjerciciosCl1 {
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
                        "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4",
                        "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Salir"
                },
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion) {
        switch (seleccion) {
            case 0:
                ejercicio1();
                break;
            case 1:
                ejercicio2();
                break;
            case 2:
                ejercicio3();
                break;
            case 3:
                ejercicio4();
                break;
            case 4:
                ejercicio5();
                break;
            case 5:
                ejercicio6();
                break;
            case 6:
                ejercicio7();
                break;
            case 7:
                ejercicio8();
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
    public static void ejercicio1() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos:"));
        double sumaMasa = 0;
        for (int i = 0; i < n; i++) {
            double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión:"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura:"));
            double masa = calcularMasaAire(presion, volumen, temperatura);
            sumaMasa += masa;
        }
        double promedioMasa = sumaMasa / n;
        JOptionPane.showMessageDialog(null, "El promedio de masa es: " + promedioMasa);
    }

    // Método para calcular la masa de aire
    public static double calcularMasaAire(double presion, double volumen, double temperatura) {
        return (presion * volumen) / (0.37 * (temperatura + 460));
    }

    // Ejercicio 2
    public static void ejercicio2() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de gallinas:"));
        double sumaCalidad = 0;
        for (int i = 0; i < n; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina:"));
            int huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos:"));
            double calidad = calcularCalidadGallina(peso, altura, huevos);
            sumaCalidad += calidad;
        }
        double promedioCalidad = sumaCalidad / n;
        double precio = calcularPrecioHuevo(promedioCalidad);
        JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: " + precio);
    }

    // Método para calcular la calidad de una gallina
    public static double calcularCalidadGallina(double peso, double altura, int huevos) {
        return (peso * altura) / huevos;
    }

    // Método para calcular el precio del huevo
    public static double calcularPrecioHuevo(double promedioCalidad) {
        if (promedioCalidad >= 15) {
            return 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8) {
            return 1.0 * promedioCalidad;
        } else {
            return 0.8 * promedioCalidad;
        }
    }

    // Ejercicio 3
    public static void ejercicio3() {
        int suma = calcularSumaSucesion();
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }

    // Método para calcular la suma de la sucesión 100, 98, 96, ..., 0
    public static int calcularSumaSucesion() {
        int suma = 0;
        for (int i = 100; i >= 0; i -= 2) {
            suma += i;
        }
        return suma;
    }

    // Ejercicio 4
    public static void ejercicio4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación:"));
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double porcentajeAprobados = (aprobados * 100.0) / n;
        double porcentajeReprobados = (reprobados * 100.0) / n;
        JOptionPane.showMessageDialog(null, "Porcentaje de aprobados: " + porcentajeAprobados + "%\nPorcentaje de reprobados: " + porcentajeReprobados + "%");
    }

    // Ejercicio 5
    public static void ejercicio5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = calcularSumaSucesion5(n);
        String sucesion = obtenerSucesion5(n);
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }

    // Método para calcular la suma de la sucesión 20, 25, 30, ..., N
    public static int calcularSumaSucesion5(int n) {
        int suma = 0;
        for (int i = 20; i <= n; i += 5) {
            suma += i;
        }
        return suma;
    }

    // Método para obtener la sucesión 20, 25, 30, ..., N
    public static String obtenerSucesion5(int n) {
        String sucesion = "";
        for (int i = 20; i <= n; i += 5) {
            sucesion += i + " ";
        }
        return sucesion;
    }

    // Ejercicio 6
    public static void ejercicio6() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = calcularSumaSucesion6(n);
        String sucesion = obtenerSucesion6(n);
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }

    // Método para calcular la suma de la sucesión 1, 4, 9, ..., N^2
    public static int calcularSumaSucesion6(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    // Método para obtener la sucesión 1, 4, 9, ..., N^2
    public static String obtenerSucesion6(int n) {
        String sucesion = "";
        for (int i = 1; i <= n; i++) {
            sucesion += (i * i) + " ";
        }
        return sucesion;
    }

    // Ejercicio 7
    public static void ejercicio7() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de valores:"));
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Número mayor: " + mayor + "\nNúmero menor: " + menor);
    }

    // Ejercicio 8
    public static void ejercicio8() {
        int suma = calcularSuma1a100();
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }

    // Método para calcular la suma de los números del 1 al 100
    public static int calcularSuma1a100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        return suma;
    }
}