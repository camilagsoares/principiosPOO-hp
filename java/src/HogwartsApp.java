// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

public class HogwartsApp {
    public static void main(String[] args) {
        Aluno harry = new Aluno("Harry Potter", 11, "Grifinória");
        Professor snape = new Professor("Severus Snape", 38, "Poções");
        Casa grifinoria = new Casa("Grifinória", "Leão");

        grifinoria.adicionarAluno(harry);
        snape.atribuirPontos(harry, 10);

        // Lógica para atualizar pontos e realizar outras operações
    }
}