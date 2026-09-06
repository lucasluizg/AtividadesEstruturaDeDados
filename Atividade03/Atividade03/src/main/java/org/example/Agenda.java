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

    public Contato buscarContato(String nome) {
        int indice =  retornarIndice(nome);

        Contato buscaContato = null;

        for (int i = 0; i < agendaTelefonica.length; i++) {
            for (int j = 0; j < agendaTelefonica[indice].getTamanho(); j++) {
                Contato contato = (Contato) agendaTelefonica[indice].obter(j);

                if (contato.getNome().equals(nome)) {
                    buscaContato = contato;
                }
            }
        }

        return buscaContato;
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) {
        int indice = retornarIndice(contatoAntigo.getNome());

        for (int i = 0; i < agendaTelefonica.length; i++) {
            for (int j = 0; j < agendaTelefonica[indice].getTamanho(); j++) {
                Contato contato = (Contato) agendaTelefonica[indice].obter(j);

                if (contato.getNome().equals(contatoAntigo.getNome())) {
                    contatoAntigo.setTelefone(contatoNovo.getTelefone());
                }
            }
        }

    }


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