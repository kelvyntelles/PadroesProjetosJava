package padroescriacao.prototype;

public class Politico implements Cloneable  {

    private String nome;
    private Endereco endereco;
    private Partido partido;

    public Politico(String nome, Endereco endereco, Partido partido) {
        this.nome = nome;
        this.endereco = endereco;
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public Politico clone() throws CloneNotSupportedException {
        Politico politicoClone = (Politico) super.clone();
        politicoClone.endereco = (Endereco) politicoClone.endereco.clone();
        politicoClone.partido = (Partido) politicoClone.partido.clone();
        return politicoClone;
    }

    @Override
    public String toString() {
        return "Politico{" +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", partido=" + partido +
                '}';
    }
}
