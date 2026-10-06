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

        for (int i = 0; i < processos.length; i++) {
            for (int j = 0; j < processos.length; j++) {
                if (processos[j].getTempoChegada() == i) {
                    System.out.println("Tempo " + i + ": " + processos[j].getNome() + " chegou e entrou na fila.");
                    fila.enfileirar(processos[j]);
                }
            }

            tempo(processos[i].getNome());
            if (processos[i].getTempoChegada() > 0) {
                processos[i].setTempoChegada(processos[i].getTempoChegada() - 2);
            } else if (processos[i].getTempoChegada() <= 0) {
                fila.desinfileirar();
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
