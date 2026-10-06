package org.example;

public class FilaCircular <T extends Comparable<T>> {

    // Composição para usar as funções do vetor.
    private Vetor<T> vetor;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular (int capacidade) {
        vetor = new Vetor<>(capacidade);
        tamanho = 0;
        fim = -1;
        inicio = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == vetor.getElementos().length) {
            throw new RuntimeException("Fila está cheia!");
        }

        fim = (fim + 1) % vetor.getElementos().length;
        vetor.getElementos()[fim] = elemento;
        tamanho++;
    }

    public T desinfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila está vazia!");
        }

        T valor = vetor.getElementos()[inicio];
        vetor.getElementos()[inicio] = null;

        inicio = (inicio + 1) % vetor.getElementos().length;
        tamanho--;

        return valor;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void imprimir() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % vetor.getElementos().length;
            System.out.print(vetor.getElementos()[indice] + " ");
        }
        System.out.println();
    }

    public Vetor<T> getVetor() {
        return vetor;
    }

    public void setVetor(Vetor<T> vetor) {
        this.vetor = vetor;
    }
}