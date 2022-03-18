package padroescriacao.factorymethod;

public class ServicoProducaoCerveja implements InterfaceServico {

    public String executarProducao() {
        return "Produção de cerveja efetivada";
    }

    public String cancelarProducao() {
        return "Produção de cerveja cancelada";
    }

}
