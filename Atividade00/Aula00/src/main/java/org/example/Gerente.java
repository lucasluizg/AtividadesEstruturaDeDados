package org.example;

public class Gerente {

    private String nome;
    private double salario;
    private Equipe equipe;

    public Gerente(String nome, double salario, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;

        int quantidade = equipe.getFuncionarios().size();
        double bonus = salario * ((double) quantidade / 100);
        this.salario = salario + bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public void bonusSalarioGerente () {
        this.salario = this.salario * 1.1;
    }
}