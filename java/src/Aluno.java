// Classe Aluno
public class Aluno extends Pessoa {
    private String casa;
    private int pontos;

    public Aluno(String nome, int idade, String casa) {
        super(nome, idade);
        this.casa = casa;
        this.pontos = 0;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    // Métodos para ganhar e perder pontos
    public void ganharPontos(int pontos) {
        this.pontos += pontos;
    }

    public void perderPontos(int pontos) {
        this.pontos -= pontos;
    }
}
