package org.example;

public class Pilha <T extends Comparable<T>>{

    // Usa composição para usar as funções de Vetor.
    private Vetor<T> vetor;

    public Pilha(int capacidade) {
        vetor = new Vetor<>(capacidade);
    }

    public void push(T elemento) {
        vetor.inserir(elemento);
    }

    public boolean isEmpty() {
        return vetor.getTamanho() == 0;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }

        T valor = vetor.obter(vetor.getTamanho() - 1);
        vetor.remover(vetor.obter(vetor.getTamanho() - 1));
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha Vazia");
        }
        return vetor.obter(vetor.getTamanho() - 1);
    }

    public void imprimir() {
        vetor.imprimir();
    }



}