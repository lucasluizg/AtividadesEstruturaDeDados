package org.example;

public class Main {
    static void main() {

        Processo p1 = new Processo("P1", 7, 0, "EXECUTANDO");
        Processo p2 = new Processo("P2", 4, 0, "EXECUTANDO");
        Processo p3 = new Processo("P3", 5, 1, "EXECUTANDO");
        Processo p4 = new Processo("P4", 6, 2, "EXECUTANDO");
        Processo p5 = new Processo("P5", 3, 4, "EXECUTANDO");

        Processo[] processos = {p1, p2, p3, p4, p5};

        Escalonador escalonador = new Escalonador();

        escalonador.checarProcesso(processos);


    }
}