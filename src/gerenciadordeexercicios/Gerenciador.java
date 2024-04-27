package gerenciadordeexercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {
    private List<mesExercicios> meses;
    private Scanner scanner;

    public Gerenciador() {
        meses = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarExercicio() {
        System.out.print("Digite o nome do exercício: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade de séries: ");
        int series = scanner.nextInt();
        System.out.print("Digite o número de repetições: ");
        int repeticoes = scanner.nextInt();
        System.out.print("Digite a carga (em kg): ");
        double carga = scanner.nextDouble();
        scanner.nextLine();

        Exercicio exercicio = new Exercicio(nome, series, repeticoes, carga);
        meses.get(meses.size() - 1).adicionarExercicio(exercicio);

        System.out.println("Exercício adicionado com sucesso!");
    }
}
   // public void executarEx

