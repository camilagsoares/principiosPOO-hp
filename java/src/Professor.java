// Classe Professor que herda de Pessoa
public class Professor extends Pessoa {
    private String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public void atribuirPontos(Aluno aluno, int pontos) {
        aluno.ganharPontos(pontos);
    }

    public void deduzirPontos(Aluno aluno, int pontos) {
        aluno.perderPontos(pontos);
    }

    // Getters e Setters

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
