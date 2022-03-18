package padroescriacao.prototype;

public class Partido implements Cloneable  {

    private String nome;
    private String numero;

    public Partido(String nome, String numero) {
        super();
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

}
