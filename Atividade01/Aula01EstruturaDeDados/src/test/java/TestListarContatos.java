import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestListarContatos {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Contato ana = new Contato("Ana", "3234-2567", "ana@gmail.com");
    Contato bruno = new Contato("Bruno", "2345-5478", "bruno@gmail.com");
    Contato carol = new Contato("Carol", "6434-9821", "carol@gmail.com");
    Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");
    Contato luana = new Contato("Luana", "9585-8384", "luana@hotmail.com");
    Agenda agenda = new Agenda(10);

    @Test
    @DisplayName("Teste para listar os contatos")
    void testeListarContatos() {
        agenda.adicionarContato(lucas);
        agenda.adicionarContato(ana);
        agenda.adicionarContato(bruno);
        agenda.adicionarContato(carol);
        agenda.adicionarContato(daniel);
        agenda.adicionarContato(luana);
        assertNotNull(agenda.listarContatos(agenda), "A agenda deve ter contatos inseridos!");
    }
}