package org.example;


public class Agenda {

    private Contato[] agendaTelefonica;
    private int tamanho;

    public Agenda(int limite) {
        agendaTelefonica = new Contato[limite];
        this.tamanho = 0;
    }

    public void adicionarContato(Contato contatoNovo) {
        if (tamanho < agendaTelefonica.length) {
            agendaTelefonica[tamanho] = contatoNovo;
            tamanho++;
        } else {
            System.out.println("Agenda está cheia!");
        }

    }

    public void removerContato(Contato contatoNovo) {
        int indice = buscarIndice(contatoNovo);

        if (indice == 0) {
            agendaTelefonica[indice] = null;
            tamanho--;
        } else {
            for (int i = indice; i < tamanho - 1; i++) {
                agendaTelefonica[i] = agendaTelefonica[i + 1];
            }
            agendaTelefonica[tamanho - 1] = null;
            tamanho--;
        }

    }

    public Contato buscarContato(Contato contatoNovo) {
        Contato buscaContato = null;

        for (Contato contato : agendaTelefonica) {
            if (contato.equals(contatoNovo)) {
                buscaContato = contato;
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
        int j = 0;
        int novoComprimento = tamanho + listaContatos.length;

        if (novoComprimento > agendaTelefonica.length) {
            throw new IndexOutOfBoundsException("Lote é maior que a capacidade da agenda!");
        }

        for (int i = tamanho; i < novoComprimento; i++) {
            agendaTelefonica[i] = listaContatos[j];
            tamanho++;
            j++;
        }
    }

    public Contato buscaPorPrefixo(String prefixo) {
        for (Contato contato : agendaTelefonica) {
            if (contato.getNome().startsWith(prefixo)) {
                return contato;
            }
        }
        return null;
    }

    public Contato listarContatos(Agenda agenda) {
        if (tamanho == 0) {
            System.out.println("A Agenda Telefônica está vazia.");
        }

        for (Contato contato : agendaTelefonica) {
            return contato;
        }
        return null;
    }


    public int buscarIndice(Contato contatoNovo) {
        int indice = 0;

        for (int i = 0; i < tamanho; i++) {
            if (contatoNovo.equals(agendaTelefonica[i])) {
                indice = i;
            }
        }
        return indice;
    }

    public int tamanhoAtualAgenda() {
        return tamanho;
    }
    

    public void listarContatos() {
        if (agendaTelefonica.length == 0) {
            System.out.println("A Agenda Telefônica está vazia.");
        }

        for (int i = 0; i < agendaTelefonica.length; i++) {
            if (agendaTelefonica[i] != null) {
                System.out.println("Nome: " + agendaTelefonica[i].getNome());
                System.out.println("Telefone: " + agendaTelefonica[i].getTelefone());
                System.out.println("Email: " + agendaTelefonica[i].getEmail());
            }
        }
    }

}