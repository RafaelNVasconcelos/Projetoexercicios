package gerenciadordeexercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class mesExercicios {
    private List<Exercicio> exercicios;

    public mesExercicios() {
        exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public void executarExercicio(int indice) {
        if (indice >= 0 && indice < exercicios.size()) {
            Exercicio exercicio = exercicios.get(indice);
            exercicio.executar();
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarExercicios() {
        if (exercicios.isEmpty()) {
            System.out.println("Não há exercícios cadastrados.");
        } else {
            for (int i = 0; i < exercicios.size(); i++) {
                System.out.println((i + 1) + ". " + exercicios.get(i));
            }
        }
    }
}
