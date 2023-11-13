public class Casa {
    private String nome;
    private String emblema;
    private int totalPontos;
    private List<Aluno> listaAlunos;

    public Casa(String nome, String emblema) {
        this.nome = nome;
        this.emblema = emblema;
        this.totalPontos = 0;
        this.listaAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmblema() {
        return emblema;
    }

    public void setEmblema(String emblema) {
        this.emblema = emblema;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
