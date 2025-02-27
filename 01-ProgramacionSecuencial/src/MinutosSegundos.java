import javax.swing.*;

public class MinutosSegundos {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"programa que convierte segundos a minutos  ");

        //declaracion variables
        int Segundos = 0;
        Segundos = Integer.parseInt(JOptionPane.showInputDialog("introduce los segundos a calcular"));
        int DuracionT = 60;
        int Resultado1 = Segundos / DuracionT;

        JOptionPane.showMessageDialog(null,"la conversion de segundos a minutos es  " +
                 Resultado1 + " minutos ");





    }
}
