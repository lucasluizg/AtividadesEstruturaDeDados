import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestListarContatos {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda();

    @Test
    @DisplayName("Teste para listar os contatos")
    void testeListarContatos() {
        agenda.adicionarContato(contato);
        assertNotNull(agenda.listarContatos(agenda.getAgendaTelefonica()), "A agenda deve ter contatos inseridos!");
    }
}