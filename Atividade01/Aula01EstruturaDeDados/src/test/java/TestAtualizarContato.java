import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAtualizarContato {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda();

    @Test
    @DisplayName("Teste para verificar se o contato está sendo atualizado.")
    void testAtualizarContato() {
        agenda.adicionarContato(contato);
        agenda.atualizarContato("3346-8613", "Bruno", "9876-5432", "bruno@gmail.com");
        assertAll("Testes para verificar os dados atualizados.",
                () -> assertEquals("Bruno", agenda.buscarContato("9876-5432").getNome()),
                () -> assertEquals("9876-5432", agenda.buscarContato("9876-5432").getTelefone()),
                () -> assertEquals("bruno@gmail.com", agenda.buscarContato("9876-5432").getEmail())
        );
    }

}