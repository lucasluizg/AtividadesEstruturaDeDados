import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestBuscarPorPrefixo {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda();

    @Test
    @DisplayName("Teste para verificar se está buscando o prefixo.")
    void testeBuscarPorPrefixo() {
        agenda.adicionarContato(contato);
        assertNotNull(agenda.buscaPorPrefixo("Lu"), "Deve retornar o Lucas.");
    }

}
