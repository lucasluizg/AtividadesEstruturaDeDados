package org.example;

public class Projeto {

    private String nome;
    private Gerente dono;
    private boolean finalizado;

    public Projeto(String nome, Gerente dono, String finalizado) {
        this.nome = nome;
        this.dono = dono;

        if (finalizado.equalsIgnoreCase("finalizado")) {
            this.finalizado = true;
            this.dono.bonusSalarioGerente();
            this.dono.getEquipe().bonusSalarioFuncionarios();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getDono() {
        return dono;
    }

    public void setDono(Gerente dono) {
        this.dono = dono;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}