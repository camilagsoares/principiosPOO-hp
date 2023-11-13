public class HogwartsApp {
    public static void main(String[] args) {
        Aluno harry = new Aluno("Harry Potter", 11, "Grifinória");
        Professor snape = new Professor("Severus Snape", 38, "Poções");
        Casa grifinoria = new Casa("Grifinória", "Leão");

        grifinoria.adicionarAluno(harry);
        snape.atribuirPontos(harry, 10);

        // Adicionando interações com as novas classes
        Magia expelliarmus = new Magia("Expelliarmus", "Desarma o oponente");
        Quadribol quadribolTime = new Quadribol("Gryffindor");

        harry.ganharPontos(5); // Ganha pontos como aluno
        quadribolTime.marcarPontos(50); // Marca pontos no quadribol

        CriaturaMagica hipogrifo = new CriaturaMagica("Hipogrifo", "Criatura mágica com a cabeça de uma águia e o corpo de um cavalo.");

        Pocao pocaoAmortentia = new Pocao("Amortentia", "Causa uma poderosa obsessão ou amor irrestrito no bebedor.");
        Feitico lumos = new Feitico("Lumos", "Faz a ponta da varinha brilhar como uma lanterna.");

        ArtefatoMagico varinhaDasVarinhas = new ArtefatoMagico("Varinha das Varinhas", "Uma das varinhas mais poderosas que já existiu.");

        // Exemplo de uso dos getters
        System.out.println("Nome da magia: " + expelliarmus.getNome());
        System.out.println("Pontuação do time de Quadribol: " + quadribolTime.getPontuacao());
        System.out.println("Nome da criatura mágica: " + hipogrifo.getNome());
        System.out.println("Efeito da poção: " + pocaoAmortentia.getEfeito());
        System.out.println("Efeito do feitiço: " + lumos.getEfeito());
        System.out.println("Descrição do artefato mágico: " + varinhaDasVarinhas.getDescricao());

        // Lógica para atualizar pontos e realizar outras operações
    }
}
