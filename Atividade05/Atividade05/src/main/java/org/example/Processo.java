package org.example;

public class Processo implements Comparable<Processo> {

    private String nome;
    private int instrucoesRestantes;
    private int tempoChegada;
    private String status;

    public Processo(String nome, int instrucoesRestantes, int tempoChegada, String status) {
        this.nome = nome;
        this.instrucoesRestantes = instrucoesRestantes;
        this.tempoChegada = tempoChegada;
        this.status = status;
    }
}
