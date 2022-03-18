package padroescriacao.factorymethod;

public class ServicoProducaoRefrigerante implements InterfaceServico {

    public String executarProducao() {
        return "Produção de refrigerante efetivada";
    }

    public String cancelarProducao() {
        return "Produção de refrigerante cancelada";
    }

}
