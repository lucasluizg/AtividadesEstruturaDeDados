package org.example;

import java.util.Random;

public class VetorProfessor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public VetorProfessor(int quantidade){
        elementos = (T[])  new Object[quantidade];
        tamanho = 0;
    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void inserir(int indice, T elemento) {

        if (tamanho == elementos.length) {
            expandir();
        }

        if (indice < 0 || indice > elementos.length) {
            System.out.println("Posição Inválida");
            return;
        }

        // Desloca os elementos para a direita
        for (int i = tamanho ; i > indice; i-- ) {
            elementos[i] = elementos[i-1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }


    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {

        if (elementos.length <= 1) {
            return;
        }

        if (tamanho <= elementos.length / 4) {

            int novaCapacidade = elementos.length / 2;
            // Nunca permitir capacidade menor que 1
            if (novaCapacidade < 1) {
                novaCapacidade = 1;
            }

            // A capacidade não pode ficar menor que o tamanho
            if (novaCapacidade < tamanho) {
                novaCapacidade = tamanho;
            }

            T[] novo = (T[]) new Object[novaCapacidade];

            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }

            elementos = novo;
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }

        // Desloca os elementos para a esquerda
        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();
    }

    public boolean remover(T elemento) {

        int indice = localizar(elemento);
        if (indice == -1) {
            return false;
        }
        remover(indice);
        return true;
    }

    public boolean contem(T elemento) {
        return localizar(elemento) != -1;
    }



    public void inserirOrdenadov2(T valor) {

        if (localizar(valor) != -1) {
            return;
        }
        if (tamanho == 0) {
            inserir(tamanho,valor);
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            if ((Integer)valor < (Integer) elementos[i]) {
                inserir(i,valor);
                break;
            }
        }
    }


    public void inserirOrdenado(T valor) {
        if (localizar(valor) != -1) {
            System.out.println("Valor " + valor + " já existe na lista.");
            return;
        }
        if (tamanho == elementos.length) {
            expandir();
        }
        int i;
        for (i = tamanho - 1; i >= 0; i--) {
            Integer atual = (Integer) elementos[i];
            if (atual > (Integer) valor) {
                elementos[i + 1] = elementos[i]; // desloca para a direita
            } else {
                break;
            }
        }
        elementos[i + 1] = valor;
        tamanho++;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public int localizar(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] != null && elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }


    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho ; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }



}
