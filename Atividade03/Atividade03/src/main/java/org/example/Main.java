package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        Agenda minhaAgenda = new Agenda();

        interagir();

        int n = sc.nextInt();

        while (n != 5) {
            if (n == 1) {
                sc.nextLine();
                System.out.print("Digite o nome do contato: ");
                String nome = sc.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = sc.nextLine();
                Contato contato = new Contato(nome, telefone);
                minhaAgenda.adicionarContato(contato);
                System.out.println("Contato " + contato.getNome() + " adicionado com sucesso na letra '" +
                        Character.toUpperCase(contato.getNome().charAt(0)) + "' (Índice "
                        + retornarIndice(contato.getNome()) + ")!");
                System.out.println();
            } else if (n == 2) {
                sc.nextLine();
                System.out.print("Digite o nome do contato a remover: ");
                String nome = sc.nextLine();
                Contato contato = minhaAgenda.buscarContato(nome);
                minhaAgenda.removerContato(contato);
                System.out.println("Contato " + contato.getNome() + " removido com sucesso do vetor " +
                        contato.getNome().charAt(0) + "!");
                System.out.println();
            } else if (n == 3) {
                sc.nextLine();
                System.out.print("Digite o nome do contato a buscar: ");
                String nome = sc.nextLine();
                Contato contato = minhaAgenda.buscarContato(nome);
                System.out.println("Contato encontrado no vetor '" + Character.toUpperCase(contato.getNome().charAt(0))
                        + "': " + contato.getNome() + ", Telefone: " + contato.getTelefone());
                System.out.println();
            } else if (n == 4) {
                sc.nextLine();
                System.out.print("Digite o nome do contato a atualizar: ");
                String nome = sc.nextLine();
                Contato contatoAntigo = minhaAgenda.buscarContato(nome);
                System.out.print("Digite o novo telefone: ");
                String telefoneNovo = sc.nextLine();
                Contato contatoNovo = new Contato(nome, telefoneNovo);
                minhaAgenda.atualizarContato(contatoAntigo, contatoNovo);
                System.out.println("Contato '" + nome + "' atualizado com sucesso!");
                System.out.println();
            }
            interagir();
            n = sc.nextInt();
        }

    }

    public static void interagir() {
        String interfaceInicial = """
                --- MENU DA AGENDA DE CONTATOS ---
                 1 - Adicionar Contato (Ordenado)
                 2 - Remover Contato
                 3 - Buscar Contato
                 4 - Atualizar Contato
                 5 - Sair
                """;

        System.out.println(interfaceInicial);
        System.out.print("Escolha uma opção: ");
    }

    static int retornarIndice(String nome) {
        char letra = Character.toUpperCase(nome.charAt(0));

        int indice = letra - 'A';

        return indice;
    }

}