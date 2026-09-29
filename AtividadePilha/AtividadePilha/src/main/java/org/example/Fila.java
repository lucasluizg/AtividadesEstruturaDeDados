package org.example;

public class Fila<T extends Comparable> {

    private T[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Comparable[capacidade];
        this.tamanho = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Fila cheia");
        }

        elementos[tamanho] = elemento;
        tamanho++;

    }

    private boolean isEmpty() {
        return tamanho==0;
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        T elemento = elementos[0];

        for (int i = 0;  i < tamanho -1; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho -1] = null;
        tamanho--;
        return elemento;

    }

    public T frente() {
        if (isEmpty()) {
            throw  new RuntimeException("Fila vazia");
        }
        return elementos[0];
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            System.out.println("Fila: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean cheia() {
        if (tamanho == elementos.length) {
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
