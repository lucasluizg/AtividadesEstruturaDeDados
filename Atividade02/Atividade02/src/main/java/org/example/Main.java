package org.example;

import java.util.Random;

public class Main {
    static void main() {

        Vetor<Integer> vetor1 = new Vetor<>(1000);
        Vetor<Integer> vetor2 = new Vetor<>(10000);
        Vetor<Integer> vetor3 = new Vetor<>(100000);

        inserirOrdenado(vetor1, 10, 5);

        vetor1.imprimir();

    }

    public static void inserirOrdenado(Vetor<Integer> vetor, int quantidade, int range) {

        Random aleatorio = new Random();
        while (vetor.getTamanho() < quantidade) {
            int numeroSorteado = aleatorio.nextInt(range);
            vetor.inserirOrdenadov2(numeroSorteado);
        }

    }

}
