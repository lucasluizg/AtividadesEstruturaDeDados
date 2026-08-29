package vetor;

import org.example.Contato;

public class Vetor<T extends Comparable<T>> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int capacidade) {
        elementos = (T[]) new Comparable[capacidade];
        tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Comparable[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }

        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (elementos.length > 1 && tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new Comparable[elementos.length / 2];

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

    public void inserir(int indice, T elemento) {
        if (tamanho >= elementos.length) {
            System.out.println("Vetor está cheio!");
            return;
        }

        if (indice < 0 || indice > tamanho) {
            System.out.println("Posição inválida");
            return;
        }

        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;
    }

    public void inserirOrdenadov2(T valor) {

        if (localizar(valor) != -1) {
            System.out.println("Valor " + valor + " já existe na lista.");
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


    /* public void inserirOrdenado(T valor) {
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
    } */

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
            if (elementos[i].compareTo(valor) > 0) {
                elementos[i + 1] = elementos[i]; // desloca para a direita
            } else {
                break;
            }
        }
        elementos[i + 1] = valor;
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

    public int buscaBinaria(Vetor<T> vetor, T alvo) {

        int inicio = 0;
        int fim = vetor.getTamanho();
        int valorBuscado = 0;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (vetor.obter(meio).equals(alvo) ) {
                valorBuscado = meio;
                break;
            } else if (vetor.obter(meio).compareTo(alvo) > 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }
        return valorBuscado;
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
        for (T elemento: elementos) {
            if (elemento != null) {
                System.out.println(elemento);
            }
        }
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

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public int getComprimentoVetor() {
        return elementos.length;
    }
}