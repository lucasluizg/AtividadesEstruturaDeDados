/* import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBuscarContato {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda(1);

    @Test
    @DisplayName("Teste para verificar se está buscando o contato.")
    void testeBuscarContato() {
        agenda.adicionarContato(contato);
        assertAll("Testes para verificar os dados atualizados.",
                () -> assertEquals("Lucas", agenda.buscarContato(contato).getNome()),
                () -> assertEquals("3346-8613", agenda.buscarContato(contato).getTelefone()),
                () -> assertEquals("lucas@gmail.com", agenda.buscarContato(contato).getEmail())
        );
    }

} */