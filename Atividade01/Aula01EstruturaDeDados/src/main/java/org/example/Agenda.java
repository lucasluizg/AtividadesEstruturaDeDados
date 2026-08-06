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

    public Contato buscarContato(String telefone) {
        for (Contato contato : AgendaTelefonica) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("E-mail: " + contato.getEmail());
                return contato;
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
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

    public void atualizarContato(String telefone, String nomeNovo, String telefoneNovo, String emailNovo) {
        for (Contato contato : AgendaTelefonica) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                contato.setNome(nomeNovo);
                contato.setTelefone(telefoneNovo);
                contato.setEmail(emailNovo);
            }
        }
    }

    public void manipulacaoEmLote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de contatos que você quer adicionar: ");
        int contatosAdicionados = sc.nextInt();
        sc.nextLine();

        if (contatosAdicionados >= tamanho) {
            throw new IndexOutOfBoundsException("Número de contatos adicionados maior que o tamanho permitido!");
        }

        for (int i = 0; i < contatosAdicionados;) {
            System.out.println("Digite o novo nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o novo email: ");
            String email = sc.nextLine();

            System.out.println("Digite o novo telefone: ");
            String telefoneNovo = sc.nextLine();

            Contato contatoNovo = new Contato(nome, email, telefoneNovo);

            if (AgendaTelefonica.size() > 0) {
                for (int j = 0; j < AgendaTelefonica.size(); j++) {
                    if (contatoNovo.getTelefone().equalsIgnoreCase(AgendaTelefonica.get(j).getTelefone())) {
                        System.out.println("Contato já registrado!");
                    } else {
                        AgendaTelefonica.add(contatoNovo);
                        i++;
                    }
                }
            } else {
                AgendaTelefonica.add(contatoNovo);
                i++;
            }
        }
    }

    public void buscaPorPrefixo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um prefixo: ");
        String prefixo = sc.nextLine();

        for (Contato contato : AgendaTelefonica) {
            if (contato.getNome().startsWith(prefixo)) {
                System.out.println("Nome: " + contato.getNome());
            }
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

    public int tamanhoAtualAgenda() {
        return AgendaTelefonica.size();
    }
}