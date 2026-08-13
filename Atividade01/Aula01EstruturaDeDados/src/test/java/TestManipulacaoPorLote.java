import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestManipulacaoPorLote {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Contato ana = new Contato("Ana", "3234-2567", "ana@gmail.com");
    Contato bruno = new Contato("Bruno", "2345-5478", "bruno@gmail.com");
    Contato carol = new Contato("Carol", "6434-9821", "carol@gmail.com");
    Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");

    Agenda agenda = new Agenda(4);

    @Test
    @DisplayName("Teste para verificar se a manipulação por lote está correta.")
    void testManipulacaoPorLote() {
        Contato[] listas = new Contato[] { ana, bruno, carol};
        agenda.adicionarContato(lucas);
        agenda.manipulacaoEmLote(listas);
        assertAll("Teste para verificar se o lote foi adicionado",
                () -> assertEquals("Lucas", agenda.buscarContato(lucas).getNome()),
                () -> assertEquals("3346-8613", agenda.buscarContato(lucas).getTelefone()),
                () -> assertEquals("lucas@gmail.com", agenda.buscarContato(lucas).getEmail()),
                () -> assertEquals("Ana", agenda.buscarContato(ana).getNome()),
                () -> assertEquals("3234-2567", agenda.buscarContato(ana).getTelefone()),
                () -> assertEquals("ana@gmail.com", agenda.buscarContato(ana).getEmail()),
                () -> assertEquals("Bruno", agenda.buscarContato(bruno).getNome()),
                () -> assertEquals("2345-5478", agenda.buscarContato(bruno).getTelefone()),
                () -> assertEquals("bruno@gmail.com", agenda.buscarContato(bruno).getEmail()),
                () -> assertEquals("Carol", agenda.buscarContato(carol).getNome()),
                () -> assertEquals("6434-9821", agenda.buscarContato(carol).getTelefone()),
                () -> assertEquals("carol@gmail.com", agenda.buscarContato(carol).getEmail())
        );
    }

    @Test
    @DisplayName("Teste para ver se o código verifica se a agenda está cheia.")
    void testManipulacaoPorLoteTamanho() {
        Contato[] listas = new Contato[] { ana, bruno, carol, daniel };
        agenda.adicionarContato(lucas);
        assertThrows(IndexOutOfBoundsException.class, () -> agenda.manipulacaoEmLote(listas));
    }

}

