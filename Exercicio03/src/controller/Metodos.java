package controller;
import javax.swing.JOptionPane;
public class Metodos {
    public Metodos(){
        super();
    }
    
    public int limiteVt () {
        int valor;

        while (true) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor limite:"));
            if (valor < 101 && valor > 0) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente.");;
            }
        }
        return valor;

    }

    public int[] carregarVt (int[] vt) {
        int vtTamanho = vt.length;
        for(int ctdr = 0; ctdr < vtTamanho; ctdr++) {
            vt[ctdr] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da casa " + ctdr + " do vetor:"));
        }
        return vt;
    }

    public void calcVetor (int[] vt2) {
        int vtTamanho = vt2.length;
        for(int ctdr = 0; ctdr < vtTamanho; ctdr ++) {
            if (vt2[ctdr] % 2 != 0) {
                System.out.println("O valor: " + vt2[ctdr] + ", é impar.");
            } else if (vt2[ctdr] % 2 == 0 && vt2[ctdr] % 10 == 0) {
                System.out.println( "O valor: " + vt2[ctdr] + ", é par e múltiplo de 10.");
            }
        }
        JOptionPane.showMessageDialog(null, "Função concluída, mensagens no console.");
    }
}
