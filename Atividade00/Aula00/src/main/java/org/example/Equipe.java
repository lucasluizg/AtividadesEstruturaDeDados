package org.example;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    List<Funcionario> equipe = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        equipe.remove(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return equipe;
    }

    public void setEquipe(List<Funcionario> equipe) {
        this.equipe = equipe;
    }

    public void bonusSalarioFuncionarios() {
        for (Funcionario funcionario : equipe) {
            funcionario.setSalario(funcionario.getSalario() * 1.1);
        }
    }

    public double calcularTotalSalario() {
        double total = 0;
        for (Funcionario funcionario : equipe) {
            total += funcionario.getSalario();
        }
        return total;
    }

}