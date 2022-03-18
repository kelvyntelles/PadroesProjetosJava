package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProducaoRefrigeranteTest {

    @Test
    void deveExecutarProducaoRefrigerante() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Refrigerante");
        assertEquals("Produção de refrigerante efetivada", servico.executar());
    }

    @Test
    void deveCancelarProducaoRefrigerante() {
        InterfaceServico servico = ServicoFactory.obterServico("Produção de Refrigerante");
        assertEquals("Produção de refrigerante cancelada", servico.cancelar());
    }

}