package org.example;

import java.text.DecimalFormat;

public class Main {
    static void main() {

        DecimalFormat df = new DecimalFormat("0.00");

        Funcionario jose = new Funcionario("José", 2000);
        Funcionario ana = new Funcionario("Ana", 2000);
        Funcionario pedro = new Funcionario("Pedro", 2000);
        Funcionario cristina = new Funcionario("Cristina", 2000);
        Funcionario daniel = new Funcionario("Daniel", 2000);

        Equipe equipe1 = new Equipe();
        equipe1.adicionarFuncionario(jose);
        equipe1.adicionarFuncionario(ana);
        equipe1.adicionarFuncionario(pedro);
        equipe1.adicionarFuncionario(cristina);
        equipe1.adicionarFuncionario(daniel);

        Gerente cesar = new Gerente("César", 10000, equipe1);
        Projeto sigaa = new Projeto("SIGAA", cesar, "finalizado");

        System.out.println("Nome do projeto: " + sigaa.getNome());
        System.out.println("Nome do gerente: " + cesar.getNome() + " , seu salário final: R$ " + df.format(cesar.getSalario()));
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        System.out.println();

        for (Funcionario funcionario : equipe1.getFuncionarios()) {
            System.out.println("Nome do funcionário: " + funcionario.getNome() + ", seu salário final: R$ " + df.format(funcionario.getSalario()));
        }

        double custoProjeto = cesar.getSalario() + equipe1.calcularTotalSalario();
        System.out.println();
        System.out.println("Custo total do projeto: R$ " + df.format(custoProjeto));

    }
}