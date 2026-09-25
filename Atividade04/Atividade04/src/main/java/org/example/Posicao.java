package org.example;

public class Posicao implements Comparable<Posicao> {

    int linha;
    int coluna;

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public int compareTo(Posicao o) {
        return 0;
    }
}
