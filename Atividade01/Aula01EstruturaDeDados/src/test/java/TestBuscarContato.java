import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestBuscarContato {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda();

    @Test
    @DisplayName("Teste para verificar se está buscando o contato.")
    void testeBuscarContato() {
        agenda.adicionarContato(contato);
        assertNotNull(agenda.buscarContato("3346-8613"), "O contato deve estar na agenda!");
    }

}
