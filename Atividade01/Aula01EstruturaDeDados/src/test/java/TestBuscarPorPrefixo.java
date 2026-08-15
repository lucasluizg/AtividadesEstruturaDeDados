import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBuscarPorPrefixo {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda(1);

    @Test
    @DisplayName("Teste para verificar se está buscando o prefixo.")
    void testeBuscarPorPrefixo() {
        agenda.adicionarContato(contato);
        assertEquals("Lucas", agenda.buscaPorPrefixo("Lu").getNome());
    }

}