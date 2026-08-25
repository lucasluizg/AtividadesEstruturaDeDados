package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {

        long inicio = System.nanoTime();

        // Algoritmo aqui

        Vetor<Integer> vetorA =  new Vetor<>(1000);
        Vetor<Integer> vetorB = new Vetor<>(10000);
        Vetor<Integer> vetorC = new Vetor<>(100000);

        inserirAleatorio(vetorC, 100000, 200000);

        int valorInicio = valorInicio(vetorC);
        int valorMeio = valorMeio(vetorC);
        int valorFim = valorFim(vetorC);

        int pos = Arrays.binarySearch(vetorC.getElementos(), valorFim);
        long fim = System.nanoTime();
        /* long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms"); */
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo Arrays.binarySearch: " + duracaoMs + " ms");


    }

    public static void inserirAleatorio(Vetor<Integer> vetor, int quantidade, int range) {

        Random aleatorio = new Random();
        while (vetor.obterTamanho() < quantidade) {
            int numeroSorteado = aleatorio.nextInt(range);
            vetor.inserirOrdenadov2(numeroSorteado);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int valor) {
        int comparador = 0;

        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.obter(i) == valor) {
                break;
            } else {
                comparador++;
            }
        }
        return comparador;

    }

    public static int buscaBinaria(Vetor<Integer> vetor, int valor) {

        int inicio = 0;
        int fim = vetor.obterTamanho();
        int comparador = 0;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (vetor.obter(meio) == valor) {
                break;
            } else if (vetor.obter(meio) > valor) {
                fim = meio - 1;
                comparador++;
            } else {
                inicio = meio + 1;
                comparador++;
            }

        }
        return comparador;

    }

    public static int valorInicio(Vetor<Integer> vetor) {
        return vetor.obter(0);
    }

    public static int valorMeio(Vetor<Integer> vetor) {
        return vetor.obter(vetor.obterTamanho() / 2);
    }

    public static int valorFim(Vetor<Integer> vetor) {
        return vetor.obter(vetor.obterTamanho() - 1);
    }


}
