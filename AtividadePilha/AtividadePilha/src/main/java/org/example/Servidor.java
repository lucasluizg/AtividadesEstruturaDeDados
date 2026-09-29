package org.example;

import java.sql.SQLOutput;
import java.util.Random;

public class Servidor {

    private int totalRegGeradas = 0;
    private int totalRegAtendidas = 0;
    private int totalRegPerdidas = 0;

    private Random aleatorio;
    private Fila<Requisicao> fila;
    private int numProcessadores;

    public Servidor(int numProcessadores, int capacidade) {
        this.numProcessadores = numProcessadores;
        this.fila = new Fila<>(capacidade);
        this.aleatorio = new Random();
    }

    public void executar(int ciclos) {
        for (int ciclo = 1; ciclo <= ciclos; ciclo++) {

            int novasReq = aleatorio.nextInt(1, 100);

            for (int i = 0; i < novasReq; i++) {
                int id = 0;

                totalRegGeradas++;
                id++;
                Requisicao requisicao = new Requisicao(id);

                if (!fila.cheia()) {
                    fila.enfileirar(requisicao);
                } else {
                    totalRegPerdidas++;
                }

            }

            for (int i = 0; i < numProcessadores; i++) {
                if (fila.getTamanho() > 0) {
                    fila.desenfileirar();
                    totalRegAtendidas++;
                }
            }

        }
    }

    public void relatorio() {
        System.out.println("Total de registros gerados: " + totalRegGeradas);
        System.out.println("Total de registros atendidos: " + totalRegAtendidas);
        System.out.println("Total de registros perdidos: " + totalRegPerdidas);

        System.out.println("Pacotes recebidos: ");
        fila.imprimir();

    }


}
