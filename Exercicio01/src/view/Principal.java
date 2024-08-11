package view;
import controller.Metodos;
public class Principal {
    public static void main(String[] args) {
        Metodos metdos = new Metodos();

        int[] vt1000 = new int[1000];
        int[] vt10000 = new int[10000];
        int[] vt100000 = new int[100000];
        // Enviar valores para classe metodos
        metdos.vetCalculo(vt1000);
        metdos.vetCalculo(vt10000);
        metdos.vetCalculo(vt100000);
    }
}
