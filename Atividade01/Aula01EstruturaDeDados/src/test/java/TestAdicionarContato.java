/* import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAdicionarContato {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda(1);

    @Test
    @DisplayName("Teste para verificar se o usuário está com o nome sendo inserido.")
    void testeVerificarNome() {
        agenda.adicionarContato(lucas);
        assertEquals("Lucas", lucas.getNome());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está com o telefone sendo inserido.")
    void testeVerificarTelefone(){
        agenda.adicionarContato(lucas);
        assertEquals("3346-8613", lucas.getTelefone());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está com o email sendo inserido.")
    void testeVerificarEmail() {
        agenda.adicionarContato(lucas);
        assertEquals("lucas@gmail.com", lucas.getEmail());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está sendo inserido na Agenda.")
    void testeAdicionarUsuario() {
        agenda.adicionarContato(lucas);
        assertEquals(1, agenda.tamanhoAtualAgenda());
    }

} */