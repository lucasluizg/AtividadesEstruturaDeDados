package org.example;

public class Requisicao implements Comparable {

    int id = 0;

    public Requisicao(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
