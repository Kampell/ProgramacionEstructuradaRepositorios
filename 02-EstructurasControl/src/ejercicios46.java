import javax.swing.*;

public class ejercicios46 {
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
                new Object[] {"Ejercicio 4", "Ejercicio 5", "Ejercicio 6"},
                null
        );
    }

    // Método para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int seleccion, String despedida) {
        switch (seleccion) {
            case 0:
                Problema4();
                break;
            case 1:
                Problema5();
                break;
            case 2:
                Problema6();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
        JOptionPane.showMessageDialog(null, despedida);
    }

    // Método para el Ejercicio 4
    public static void Problema4() {
        // Declaración de variables
        double precio, descuento = 0, precioConDescuento, precioConIva;
        String marca;

        // Ingreso de datos
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del estéreo"));
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca del estéreo");

        // Cálculo de descuento
        if (precio >= 2000) {
            descuento += 0.10;
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
        }

        // Aplicar descuento
        precioConDescuento = precio - (precio * descuento);

        // Cálculo de IVA (16%)
        precioConIva = precioConDescuento * 1.16;

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El precio final con IVA incluido es: $" + precioConIva);
    }

    // Método para el Ejercicio 5
    public static void Problema5() {
        // Declaración de variables
        double kilos, precioPorKilo = 3.0, descuento = 0, precioFinal;

        // Ingreso de datos
        kilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número de kilos de manzanas"));

        // Cálculo de descuento
        if (kilos > 2 && kilos <= 5) {
            descuento = 0.10;
        } else if (kilos > 5 && kilos <= 10) {
            descuento = 0.15;
        } else if (kilos > 10) {
            descuento = 0.20;
        }

        // Cálculo del precio final
        precioFinal = kilos * precioPorKilo * (1 - descuento);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El precio final es: $" + precioFinal);
    }

    // Método para el Ejercicio 6
    public static void Problema6() {
        // Declaración de variables
        double capital, prestamo = 0, nuevoSaldo, insumos, incentivos;

        // Ingreso de datos
        capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital actual de la empresa"));

        // Cálculo del nuevo saldo
        if (capital < 0) {
            prestamo = 10000 - capital;
            nuevoSaldo = 10000;
        } else if (capital >= 0 && capital <= 20000) {
            prestamo = 20000 - capital;
            nuevoSaldo = 20000;
        } else {
            nuevoSaldo = capital;
        }

        // Distribución del presupuesto
        double restante = nuevoSaldo - 7000; // 5000 para equipo de cómputo y 2000 para mobiliario
        insumos = restante / 2;
        incentivos = restante / 2;

        // Mostrar resultado
        String mensaje = "Distribución del presupuesto:\n" +
                "Equipo de cómputo: $5000\n" +
                "Mobiliario: $2000\n" +
                "Compra de insumos: $" + insumos + "\n" +
                "Incentivos al personal: $" + incentivos;
        if (prestamo > 0) {
            mensaje += "\nCantidad pedida al banco: $" + prestamo;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}