// Classe Feitico
public class Feitico {
    private String nome;
    private String efeito;

    public Feitico(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
}