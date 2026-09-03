package org.example;

import vetor.Vetor;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String interfaceInicial = """
                --- MENU DA AGENDA DE CONTATOS ---
                 1 - Adicionar Contato (Ordenado)
                 2 - Remover Contato
                 3 - Buscar Contato
                 4 - Atualizar Contato
                 5 - Sair
                """;

        System.out.println(interfaceInicial);

        Vetor[] minhaAgenda = new Vetor[26];

        int n;

        System.out.print("Escolha uma opção: ");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.print("Digite o nome do contato: ");
                String nome = sc.nextLine();
                System.out.println("Digite o telefone: ");
                String telefone = sc.nextLine();
                Contato contato = new Contato(nome, telefone);
                char primeiraLetra = Character.toUpperCase(contato.getNome().charAt(0));
                System.out.print("Contato '" + contato.getNome() + "' adicionado com sucesso na letra '"
                        + primeiraLetra + "' (Indice " + mapeamentoIndice(contato, minhaAgenda) + ")!");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }


    }

    static int mapeamentoIndice(Contato contato, Vetor[] vetor) {
        char letra = Character.toUpperCase(contato.getNome().charAt(0));

        int indice = letra - 'A';

        vetor[indice].inserir(contato);

        return indice;
    }

}