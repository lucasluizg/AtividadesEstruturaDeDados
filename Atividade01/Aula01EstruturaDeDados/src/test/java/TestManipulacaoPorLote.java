import org.example.Agenda;
import org.example.Contato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestManipulacaoPorLote {

    Contato lucas = new Contato("Lucas", "3346-8613", "lucas@gmail.com");
    Contato ana = new Contato("Ana", "3234-2567", "ana@gmail.com");
    Contato bruno = new Contato("Bruno", "2345-5478", "bruno@gmail.com");
    Contato carol = new Contato("Carol", "6434-9821", "carol@gmail.com");
    Contato daniel = new Contato("Daniel", "8716-2123", "daniel@gmail.com");

    Agenda agenda = new Agenda();

    List<Contato> contatos = new ArrayList<>();

    {
        contatos.add(lucas);
        contatos.add(ana);
        contatos.add(bruno);
        contatos.add(carol);
        contatos.add(daniel);
    }

    @Test
    @DisplayName("Teste para verificar se a manipulação por lote está correta.")
    void testManipulacaoPorLote() {
        assertNotNull(agenda.manipulacaoEmLote(contatos), "Deve haver contatos adicionados na lista.");
    }

}
