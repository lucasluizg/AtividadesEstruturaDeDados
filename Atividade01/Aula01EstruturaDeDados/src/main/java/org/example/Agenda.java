package org.example;


public class Agenda {

    private Contato[] agendaTelefonica;
    private int tamanho;

    public Agenda(int limite) {
        agendaTelefonica = new Contato[limite];
        this.tamanho = 0;
    }

    public void expandir() {
        Contato[] novo = new Contato[agendaTelefonica.length * 2];

        for (int i = 0; i < agendaTelefonica.length; i++) {
            novo[i] = agendaTelefonica[i];
        }

        agendaTelefonica = novo;
    }

    public void reduzir() {
        if (agendaTelefonica.length > 1 && tamanho <= agendaTelefonica.length / 4) {
            Contato[] novo = new Contato[agendaTelefonica.length / 2];

            for (int i = 0; i < tamanho; i++) {
                novo[i] = agendaTelefonica[i];
            }

            agendaTelefonica = novo;
        }
    }

    public void adicionarContato(Contato contatoNovo) {
        if (tamanho == agendaTelefonica.length) {
            expandir();
        }

        agendaTelefonica[tamanho] = contatoNovo;
        tamanho++;
    }

    public void removerContato(Contato contatoNovo) {
        int indice = buscarIndice(contatoNovo);

        for (int i = indice; i < tamanho - 1; i++) {
            agendaTelefonica[i] = agendaTelefonica[i + 1];
        }
        agendaTelefonica[tamanho - 1] = null;
        tamanho--;
        reduzir();
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

    public int comprimentoAgenda() {
        return agendaTelefonica.length;
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