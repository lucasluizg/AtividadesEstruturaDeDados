import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRemoverContato {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Contato ana = new Contato("Ana", "3234-2567", "ana@gmail.com");
    Contato bruno = new Contato("Bruno", "2345-5478", "bruno@gmail.com");
    Contato carol = new Contato("Carol", "6434-9821", "carol@gmail.com");
    Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");
    Contato luana = new Contato("Luana", "9585-8384", "luana@hotmail.com");
    Agenda agenda = new Agenda(6);

    @Test
    @DisplayName("Teste para verificar se o contato está sendo removido.")
    void testeRemoverContatoUnico() {
        agenda.adicionarContato(lucas);
        agenda.removerContato(lucas);
        assertEquals(0, agenda.tamanhoAtualAgenda());
    }

    @Test
    @DisplayName("Teste com mais de um contato.")
    void testeRemoverMaisDeUmContato() {
        agenda.adicionarContato(lucas);
        agenda.adicionarContato(ana);
        agenda.adicionarContato(bruno);
        agenda.adicionarContato(carol);
        agenda.adicionarContato(daniel);
        agenda.removerContato(daniel);
        assertEquals(4, agenda.tamanhoAtualAgenda());
    }

    @Test
    @DisplayName("Teste para verificar se o comprimento total da agenda está sendo diminuído.")
    void testeVerificarseDiminui() {
        agenda.adicionarContato(lucas);
        agenda.adicionarContato(ana);
        agenda.adicionarContato(bruno);
        agenda.adicionarContato(carol);
        agenda.adicionarContato(daniel);
        agenda.adicionarContato(luana);
        agenda.removerContato(luana);
        agenda.removerContato(daniel);
        agenda.removerContato(carol);
        agenda.removerContato(bruno);
        agenda.removerContato(ana);
        assertEquals(3, agenda.comprimentoAgenda());
    }

}