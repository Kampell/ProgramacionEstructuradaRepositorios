import javax.swing.*;

public class EjerciciosCW {
    public static void main(String[] args) {
        // Declaración de variables
        boolean continuar = true;
        String despedida = "Gracias por usar el menú";

        // Menú principal
        do {
            int seleccion = mostrarMenu();

            if (seleccion == 3 || seleccion == -1) {
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
                new Object[]{"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Salir"},
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
        boolean continuar = true;

        do {
            double totalCompra = calcularTotalCompra();
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalCompra);

            continuar = preguntarOtraCompra();
        } while (continuar);
    }

    // Método para calcular el total de la compra con descuento
    public static double calcularTotalCompra() {
        String[] opciones = {"Roja", "Amarilla", "Blanca"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione el color de la bolita",
                "Descuento", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la compra:"));
        double descuento = obtenerDescuento(seleccion);

        return precio - (precio * descuento);
    }

    // Método para obtener el descuento según el color de la bolita
    public static double obtenerDescuento(int seleccion) {
        switch (seleccion) {
            case 0:
                return 0.40;
            case 1:
                return 0.25;
            case 2:
                return 0.0;
            default:
                return 0.0;
        }
    }

    // Método para preguntar si desea realizar otra compra
    public static boolean preguntarOtraCompra() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra compra?",
                "Continuar", JOptionPane.YES_NO_OPTION);
        return respuesta == 0;
    }

    // Ejercicio 2
    public static void Problema2() {
        double totalCompra = 0;
        boolean continuar = true;

        do {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad adquirida:"));

            totalCompra += precio * cantidad;

            continuar = preguntarOtroArticulo();
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de la compra es: " + totalCompra);
    }

    // Método para preguntar si desea agregar otro artículo
    public static boolean preguntarOtroArticulo() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro artículo?",
                "Continuar", JOptionPane.YES_NO_OPTION);
        return respuesta == 0;
    }

    // Ejercicio 3
    public static void Problema3() {
        double totalDescuento = 0;
        boolean continuar = true;

        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
            double precioBoleto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto:"));

            if (edad < 5) {
                JOptionPane.showMessageDialog(null, "Los niños menores de 5 años no pueden ingresar al teatro.");
                continue;
            }

            double descuento = obtenerDescuentoPorEdad(edad);
            totalDescuento += precioBoleto * descuento;

            continuar = preguntarOtroCliente();
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de dinero dejado de percibir por descuentos es: " + totalDescuento);
    }

    // Método para obtener el descuento según la edad del cliente
    public static double obtenerDescuentoPorEdad(int edad) {
        if (edad >= 5 && edad <= 14) {
            return 0.35;
        } else if (edad >= 15 && edad <= 19) {
            return 0.25;
        } else if (edad >= 20 && edad <= 45) {
            return 0.10;
        } else if (edad >= 46 && edad <= 65) {
            return 0.25;
        } else if (edad >= 66) {
            return 0.35;
        }
        return 0.0;
    }

    // Método para preguntar si desea ingresar otro cliente
    public static boolean preguntarOtroCliente() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro cliente?",
                "Continuar", JOptionPane.YES_NO_OPTION);
        return respuesta == 0;
    }
}