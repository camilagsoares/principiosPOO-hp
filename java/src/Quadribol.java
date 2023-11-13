// Classe Quadribol
public class Quadribol {
    private String time;
    private int pontuacao;

    public Quadribol(String time) {
        this.time = time;
        this.pontuacao = 0;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void marcarPontos(int pontos) {
        this.pontuacao += pontos;
    }
}
