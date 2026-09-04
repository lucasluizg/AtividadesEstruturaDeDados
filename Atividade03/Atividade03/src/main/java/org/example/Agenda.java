package org.example;

import vetor.Vetor;

public class Agenda <T>{

    @SuppressWarnings("unchecked")
    private Vetor[] agendaTelefonica = new Vetor[26];

    public void adicionarContato(Contato contatoNovo) {
        int indice = retornarIndice(contatoNovo.getNome());

        Vetor vetor = new Vetor(100);
        vetor.inserirOrdenado(contatoNovo);
        agendaTelefonica[indice] = vetor;
    }

    public void removerContato(Contato contatoNovo) {
        int indice = retornarIndice(contatoNovo.getNome());

        agendaTelefonica[indice].remover(contatoNovo);
    }

    public Contato buscarContato(Contato contatoNovo) {
        int indice =  retornarIndice(contatoNovo.getNome());

        Contato buscaContato = null;

        for (int i = 0; i < agendaTelefonica[indice].getTamanho(); i++) {
            if (agendaTelefonica[indice].obter(i).equals(contatoNovo)) {
                buscaContato = (Contato) agendaTelefonica[indice].obter(i);
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
        for (int i = 0; i < listaContatos.length; i++) {
            int indice = retornarIndice(listaContatos[i].getNome());
            agendaTelefonica[indice].inserirOrdenado(listaContatos[i]);
        }
    }

    /* public Contato buscaPorPrefixo(String prefixo) {
        Contato contato = null;

        for (int i = 0; i < agendaTelefonica.getTamanho(); i++) {
            if (agendaTelefonica.obter(i).getNome().startsWith(prefixo)) {
                contato = agendaTelefonica.obter(i);
            }
        }
        return contato;
    }

    public int buscaBinaria(T valor) {
        return agendaTelefonica.buscaBinaria(agendaTelefonica, (Contato) valor);
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
    } */

    static int retornarIndice(String nome) {
        char letra = Character.toUpperCase(nome.charAt(0));

        int indice = letra - 'A';

        return indice;
    }

    public Vetor[] getAgendaTelefonica() {
        return agendaTelefonica;
    }

    public void setAgendaTelefonica(Vetor[] agendaTelefonica) {
        this.agendaTelefonica = agendaTelefonica;
    }
}