package padroescriacao.factorymethod;

public class ServicoProducaoAgua implements InterfaceServico {

    public String executarProducao() {
        return "Produção de água efetivada";
    }

    public String cancelarProducao() {
        return "Produção de água cancelada";
    }

}
