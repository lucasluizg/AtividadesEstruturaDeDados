package org.example;

public class Main {
    static void main() {

        FilaCircular<Processo> fila = new FilaCircular<>(10);

        fila.enfileirar(new Processo("P1", 7, 0, "EXECUTANDO"));
        fila.enfileirar(new Processo("P2", 4, 0, "EXECUTANDO"));
        fila.enfileirar(new Processo("P3", 5, 1, "EXECUTANDO"));
        fila.enfileirar(new Processo("P4", 6, 2, "EXECUTANDO"));
        fila.enfileirar(new Processo("P5", 3, 4, "EXECUTANDO"));

        /*try {
            System.out.println(nome + " executando...");
            Thread.sleep(2000); // pausa 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        public static void pegarElemento()

    }
}