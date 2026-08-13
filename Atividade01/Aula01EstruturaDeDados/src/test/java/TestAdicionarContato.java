import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAdicionarContato {

    Contato contato = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Agenda agenda = new Agenda(1);

    @Test
    @DisplayName("Teste para verificar se o usuário está com o nome sendo inserido.")
    void testeVerificarNome() {
        agenda.adicionarContato(contato);
        assertEquals("Lucas", contato.getNome());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está com o telefone sendo inserido.")
    void testeVerificarTelefone(){
        agenda.adicionarContato(contato);
        assertEquals("3346-8613", contato.getTelefone());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está com o email sendo inserido.")
    void testeVerificarEmail() {
        agenda.adicionarContato(contato);
        assertEquals("lucas@gmail.com", contato.getEmail());
    }

    @Test
    @DisplayName("Teste para verificar se o usuário está sendo inserido na Agenda.")
    void testeAdicionarUsuario() {
        agenda.adicionarContato(contato);
        assertEquals(1, agenda.tamanhoAtualAgenda());
    }

}