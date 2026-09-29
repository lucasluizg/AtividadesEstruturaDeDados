package org.example;

public class Main {
    static void main() {

        Servidor servidor = new Servidor(10, 10);

        servidor.executar(10);

        servidor.relatorio();

    }
}
