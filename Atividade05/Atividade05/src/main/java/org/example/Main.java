package org.example;

public class Main {
    public static void main(String[] args) {

        Processo p1 = new Processo("P1", 7, 0, "AGUARDANDO");
        Processo p2 = new Processo("P2", 4, 0, "AGUARDANDO");
        Processo p3 = new Processo("P3", 5, 1, "AGUARDANDO");
        Processo p4 = new Processo("P4", 6, 2, "AGUARDANDO");
        Processo p5 = new Processo("P5", 3, 4, "AGUARDANDO");

        Processo[] processos = {p1, p2, p3, p4, p5};

        Escalonador escalonador = new Escalonador();

        escalonador.checarProcesso(processos);
    }
}