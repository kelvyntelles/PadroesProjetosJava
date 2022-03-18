package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProducaoCervejaTest {

    @Test
    void deveExecutarProducaoCerveja() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Cerveja");
        assertEquals("Produção de cerveja efetivada", servico.executar());
    }

    @Test
    void deveCancelarProducaoCerveja() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Cerveja");
        assertEquals("Produção de cerveja cancelada", servico.cancelar());
    }

}