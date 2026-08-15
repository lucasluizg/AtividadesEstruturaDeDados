package org.example;

import vetor.Vetor;

public class Agenda {

    private Vetor<Contato> agendaTelefonica;

    public Agenda(int limite) {
        agendaTelefonica = new Vetor<>(limite);
    }

    public void adicionarContato(Contato contatoNovo) {
        agendaTelefonica.inserir(contatoNovo);
    }

    public void removerContato(Contato contatoNovo) {
        agendaTelefonica.remover(contatoNovo);
    }

    public Contato buscarContato(Contato contatoNovo) {
        Contato buscaContato = null;

        for (int i = 0; i < agendaTelefonica.getTamanho(); i++) {
            if (agendaTelefonica.obter(i).equals(contatoNovo)) {
                buscaContato = agendaTelefonica.obter(i);
            }
        }

        return buscaContato;
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) {
        contatoAntigo.setNome(contatoNovo.getNome());
        contatoAntigo.setTelefone(contatoNovo.getTelefone());
        contatoAntigo.setEmail(contatoNovo.getEmail());
    }

    public void manipulacaoEmLote(Contato[] listaContatos) {
        int tamanho = agendaTelefonica.getTamanho();
        for (int i = 0; i < listaContatos.length; i++) {
            agendaTelefonica.inserir(listaContatos[i]);
            tamanho++;
            agendaTelefonica.setTamanho(tamanho);
        }

    }

    public Contato buscaPorPrefixo(String prefixo) {
        Contato contato = null;

        for (int i = 0; i < agendaTelefonica.getTamanho(); i++) {
            if (agendaTelefonica.obter(i).getNome().startsWith(prefixo)) {
                contato = agendaTelefonica.obter(i);
            }
        }
        return contato;
    }

    public Contato listarContatos(Agenda agenda) {
        for (int i = 0; i < agendaTelefonica.getTamanho(); i++) {
            return agendaTelefonica.obter(i);
        }
        return null;
    }

    public int tamanhoAtualAgenda() {
        return agendaTelefonica.getTamanho();
    }

    public int comprimentoAgenda() {
        return agendaTelefonica.getComprimentoVetor();
    }


    public void listarContatos() {
        for (int i = 0; i < agendaTelefonica.getTamanho(); i++) {
            System.out.println("Nome: " + agendaTelefonica.obter(i).getNome());
            System.out.println("Telefone: " + agendaTelefonica.obter(i).getTelefone());
            System.out.println("Email: " + agendaTelefonica.obter(i).getEmail());
        }

        if (agendaTelefonica.getTamanho() == 0) {
            System.out.println("Agenda vazia!");
        }
    }

}