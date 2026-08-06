import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRemoverContato {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda();

    @Test
    @DisplayName("Teste para verificar se o contato está sendo removido.")
    void testeRemoverContato() {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato);
        agenda.removerContato("3346-8613");
        assertEquals(0, agenda.tamanhoAtualAgenda());
    }

}