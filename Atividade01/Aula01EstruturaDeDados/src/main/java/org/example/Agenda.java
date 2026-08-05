package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private List<Contato> AgendaTelefonica = new ArrayList<>();
    private int tamanho = 5;

    public void adicionarContato(Contato contatoNovo) {
        if (AgendaTelefonica.size() > tamanho) {
            System.out.println("Agenda Telefônica cheia!");
            return;
        }

        for (Contato contato : AgendaTelefonica) {
            if (contato.getNome().equalsIgnoreCase(contatoNovo.getNome()) || contato.getTelefone().equalsIgnoreCase(contatoNovo.getTelefone())) {
                System.out.println("Contato já existente");
                return;
            }
        }
        AgendaTelefonica.add(contatoNovo);
    }

    public void removerContato(String telefone) {
        for (Contato contato : AgendaTelefonica) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                AgendaTelefonica.remove(contato);
                return;
            }
        }
        System.out.println("O contato não foi encontrado!");
    }

    public void buscarContato(String telefone) {
        for (Contato contato : AgendaTelefonica) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("E-mail: " + contato.getEmail());
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public void atualizarContato(String telefone) {
        Scanner sc = new Scanner(System.in);
        for (Contato contato : AgendaTelefonica) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                System.out.println("Digite o novo nome: ");
                String nome = sc.nextLine();
                contato.setNome(nome);

                System.out.println("Digite o novo email: ");
                String email = sc.nextLine();
                contato.setEmail(email);

                System.out.println("Digite o novo telefone: ");
                String telefoneNovo = sc.nextLine();
                contato.setTelefone(telefoneNovo);
                return;
            }
        }

        System.out.println("Contato não encontrado!");
    }

    public void manipulacaoEmLote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de contatos que você quer adicionar: ");
        int contatosAdicionados = sc.nextInt();

        for (int i = 0; i < contatosAdicionados; i++) {
            System.out.println("Digite o novo nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o novo email: ");
            String email = sc.nextLine();

            System.out.println("Digite o novo telefone: ");
            String telefoneNovo = sc.nextLine();

            Contato contatoNovo = new Contato(nome, email, telefoneNovo);
            AgendaTelefonica.add(contatoNovo);
        }
    }

    public void listarContatos() {
        if (AgendaTelefonica.isEmpty()) {
            System.out.println("A Agenda Telefônica está vazia.");
        }

        for (Contato contato : AgendaTelefonica) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("E-mail: " + contato.getEmail());
        }
    }

}