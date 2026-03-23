package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            nota = scanner.nextDouble();
            soma += nota;
        }

        media = soma / 5;

        System.out.printf("Média da turma: %.1f\n", media);

        scanner.close();
    }
}
