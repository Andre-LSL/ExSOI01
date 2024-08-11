package view;
import javax.swing.JOptionPane;
import controller.Metodos;
public class Principal {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int codigo = 0;
        String message;
        while (codigo != 9) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("0 - Digitar mensagem (Typing message) (テキストを入力してください). "
                                                                 + "\n9 - Sair da Aplicação (Exit Aplication) (アプリケーションを終了する). "));
            switch (codigo) {
                case 0:
                message = JOptionPane.showInputDialog("Digite o texto (Type the text) (テキストを入力してください): ");
                metodos.procedimento(message);
                    break;
                case 9:
                    break;
            }
        }
    }
}
