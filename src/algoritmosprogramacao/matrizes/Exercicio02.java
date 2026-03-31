package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[6];
        System.out.println("Digite 6 notas:");
        for (int i = 0; i < 6; i++) {
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            soma += notas[i];
        }
        System.out.printf("Média das notas: %.1f\n", soma / 6);
        scanner.close();
    }
}
