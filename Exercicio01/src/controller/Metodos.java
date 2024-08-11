package controller;

public class Metodos {
    
    public Metodos() {
        super();
    }

    public void vetCalculo (int[] vetor) {
        double tiStart, tiFinal, tiTotal;
        int size = vetor.length;
        tiStart = System.nanoTime();

        for (int cont = 0; cont < size; cont++) {
            vetor[cont] = 0;
        }

        tiFinal = System.nanoTime();
        tiTotal = (tiFinal-tiStart)/ (Math.pow(10, 9));
        System.out.println("\nTotal time: " + tiTotal);
    }
}
