package org.example;

public class Main {
    static void main() {

        Agenda minhaAgenda = new Agenda(10);

        Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
        Contato ana = new Contato("Ana", "3234-2567", "ana@gmail.com");
        Contato bruno = new Contato("Bruno", "2345-5478", "bruno@gmail.com");
        Contato carol = new Contato("Carol", "6434-9821", "carol@gmail.com");
        Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");
        Contato luana = new Contato("Luana", "9585-8384", "luana@hotmail.com");

        minhaAgenda.adicionarContato(lucas);

        Contato[] lista = new Contato[] { daniel, carol, bruno, luana, ana };

        minhaAgenda.manipulacaoEmLote(lista);

        minhaAgenda.listarContatos();

        System.out.println(minhaAgenda.buscaBinaria(carol));

    }
}