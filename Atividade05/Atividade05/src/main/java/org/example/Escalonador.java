package org.example;

public class Escalonador {

    private FilaCircular<Processo> fila = new FilaCircular<>(10);

    public void tempo(String nome) {
        try {
            System.out.println(nome + " executando...");
            Thread.sleep(2000); // pausa 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checarProcesso(Processo[] processos) {

        int tempo = 0;

        rodarTempo(processos, tempo);

        while (!fila.estaVazia()) {
            tempo(fila.obterElementos(fila.getInicio()).getNome());
            fila.obterElementos(fila.getInicio()).setInstrucoesRestantes(fila.obterElementos(fila.getInicio()).getInstrucoesRestantes() - 2);

            if (fila.obterElementos(fila.getInicio()).getInstrucoesRestantes() > 0) {
                System.out.println(fila.obterElementos(fila.getInicio()).getNome()
                        + " executou 2 instruções. Restam "
                        + fila.obterElementos(fila.getInicio()).getInstrucoesRestantes());
                fila.enfileirar(fila.obterElementos(fila.getInicio()));
                fila.desinfileirar();
            } else {
                System.out.println(fila.obterElementos(fila.getInicio()).getNome()
                        + " executou 2 instruções. Restam 0.");
                fila.desinfileirar();
            }
            rodarTempo(processos, ++tempo);
        }

    }

    public void rodarTempo(Processo[] processos, int tempo) {
        for (int i = 0; i < processos.length; i++) {
            if (tempo == processos[i].getTempoChegada()) {
                System.out.println("Tempo " + tempo + ": " + processos[i].getNome() + " chegou e entrou na fila.");
                fila.enfileirar(processos[i]);
            }
        }
    }

    public FilaCircular<Processo> getFila() {
        return fila;
    }

    public void setFila(FilaCircular<Processo> fila) {
        this.fila = fila;
    }
}