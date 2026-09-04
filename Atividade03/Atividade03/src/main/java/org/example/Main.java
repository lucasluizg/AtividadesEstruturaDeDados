package org.example;

import vetor.Vetor;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        Contato ana = new Contato("Ana", "3346-8613");
        Contato lucas = new Contato("Lucas", "4346-8613");
        /* agenda.adicionarContato(ana);
        agenda.adicionarContato(lucas);

        System.out.println(agenda.buscarContato(ana).getNome());
        System.out.println(agenda.buscarContato(lucas).getNome()); */

        String interfaceInicial = """
                --- MENU DA AGENDA DE CONTATOS ---
                 1 - Adicionar Contato (Ordenado)
                 2 - Remover Contato
                 3 - Buscar Contato
                 4 - Atualizar Contato
                 5 - Sair
                """;

        System.out.println(interfaceInicial);

        Agenda minhaAgenda = new Agenda();

        int n;

        System.out.print("Escolha uma opção: ");
        n = sc.nextInt();

        switch (n) {
            case 1:
                sc.nextLine();
                System.out.print("Digite o nome do contato: ");
                String nome = sc.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = sc.nextLine();
                Contato contato = new Contato(nome, telefone);
                minhaAgenda.adicionarContato(contato);
                return;
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

    static int retornarIndice(String nome) {
        char letra = Character.toUpperCase(nome.charAt(0));

        int indice = letra - 'A';

        return indice;
    }

}