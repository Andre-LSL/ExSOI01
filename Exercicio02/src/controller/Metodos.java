package controller;

public class Metodos {

    public Metodos(){
        super();
    }

    public void procedimento (String mensagem) {
        int contador = 0;
        String[] lista = mensagem.split(";");
        for (String palavra : lista) {
            System.out.println(palavra);
            contador++;
        }
        System.out.println(contador);
    }
}
