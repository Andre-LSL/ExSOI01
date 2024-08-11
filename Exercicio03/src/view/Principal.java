package view;
import javax.swing.JOptionPane;
import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        int codigo = 0;
        Metodos metodos = new Metodos();
        int tamanho = metodos.limiteVt();
        int[] vetor = new int [tamanho];

        while (codigo != 9) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor \n"
                                                                + "2 - Calcular vetor \n"
                                                                + "9 - Sair do programa"));
            switch (codigo) {
                case 1:
                    vetor = metodos.carregarVt(vetor);
                    break;
                case 2:
                    metodos.calcVetor(vetor);
                    break;
                case 9:
                    break;
            }
        }
    }
}
