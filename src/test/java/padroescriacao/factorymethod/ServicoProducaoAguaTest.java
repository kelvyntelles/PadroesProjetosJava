package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProducaoAguaTest {

    @Test
    void deveExecutarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Água");
        assertEquals("Produção de água efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Água");
        assertEquals("Produção de água cancelada", servico.cancelar());
    }

}