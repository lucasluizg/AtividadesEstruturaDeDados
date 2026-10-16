package org.example;

public class Processo implements Comparable<Processo> {

    private String nome;
    private int instrucoesRestantes;
    private int instrucoesTotais;
    private int tempoChegada;
    private String status;

    public Processo(String nome, int instrucoesRestantes, int tempoChegada, String status) {
        this.nome = nome;
        this.instrucoesRestantes = instrucoesRestantes;
        this.instrucoesTotais = instrucoesRestantes;
        this.tempoChegada = tempoChegada;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInstrucoesRestantes() {
        return instrucoesRestantes;
    }

    public void setInstrucoesRestantes(int instrucoesRestantes) {
        this.instrucoesRestantes = instrucoesRestantes;
    }

    public int getInstrucoesTotais() {
        return instrucoesTotais;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(int tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Processo outro) {
        if (this.tempoChegada != outro.tempoChegada) {
            return Integer.compare(this.tempoChegada, outro.tempoChegada);
        }
        return this.nome.compareTo(outro.nome);
    }


    @Override
    public String toString() {
        return nome + "(restantes: " + instrucoesRestantes + ", status: " + status + ")";
    }
}

