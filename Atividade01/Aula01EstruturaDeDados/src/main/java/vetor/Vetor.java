package vetor;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
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
        if (elementos.length > 1 && tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new Object[elementos.length / 2];

            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }

            elementos = novo;
        }
    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void remover(T elemento) {
        int indice;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                indice = i;
            }
        }

        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();
    }

    public T obter(int indice) {
        T elemento = null;

        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido");
        }

        for (int i = 0; i < tamanho; i++) {
            if (i == indice) {
                elemento = elementos[i];
            }
        }
        return elemento;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public T[] getElementos() {
        return elementos;
    }

    public int getComprimentoVetor() {
        return elementos.length;
    }
}