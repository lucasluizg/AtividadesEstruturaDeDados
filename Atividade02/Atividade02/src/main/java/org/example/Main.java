package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {

        long inicio = System.nanoTime();

        // Algoritmo aqui

        Vetor<Integer> vetor =  new Vetor<>(1000);;

        inserirAleatorio(vetor, 100000, 200000);

        int valorInicio = valorInicio(vetor);
        int valorMeio = valorMeio(vetor);
        int valorFim = valorFim(vetor);

        System.out.println(buscaFibonacci(vetor, valorFim));
        long fim = System.nanoTime();
        /* long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms"); */
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");


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

    public static int buscaFibonacci(Vetor<Integer> vetor, int valor) {
        int n = vetor.obterTamanho();
        int comparador = 0;

        // Inicializa o fibonacci.
        int fibN2 = 0; // Segundo número na soma.
        int fibN1 = 1; // Primeiro número na soma.
        int fibN = fibN2 + fibN1; // Soma dos dois.

        while (fibN < n) {
            fibN2 = fibN1;
            fibN1 = fibN;
            fibN = fibN2 + fibN1;
            comparador++;
        }

        // Marca a área eliminada da frente: offset.
        int offset = -1;

        // Enquanto houver elementos para inspecionar
        while (fibN > 1) {
            // Verifica se fibM2 é um índice válido
            int i = Math.min(offset + fibN2, n - 1);

            // Se o elemento for maior que o valor no índice i, rotaciona para trás
            if (vetor.obter(i) < valor) {
                fibN = fibN1;
                fibN1 = fibN2;
                fibN2 = fibN - fibN1;
                offset = i;
                comparador++;
            }
            // Se o elemento for menor que o valor no índice i, rotaciona para frente
            else if (vetor.obter(i) > valor) {
                fibN = fibN2;
                fibN1 = fibN1 - fibN2;
                fibN2 = fibN - fibN1;
                comparador++;
            }
            // Elemento encontrado
            else {
                break;
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
