/* import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAtualizarContato {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");
    Agenda agenda = new Agenda(1);

    @Test
    @DisplayName("Teste para verificar se o contato está sendo atualizado.")
    void testAtualizarContato() {
        agenda.adicionarContato(lucas);
        agenda.atualizarContato(lucas, daniel);
        assertAll("Testes para verificar os dados atualizados.",
                () -> assertEquals("Daniel", agenda.buscarContato(lucas).getNome()),
                () -> assertEquals("8716-2123", agenda.buscarContato(lucas).getTelefone()),
                () -> assertEquals("daniel@gmail.com", agenda.buscarContato(lucas).getEmail())
        );
    }

} */