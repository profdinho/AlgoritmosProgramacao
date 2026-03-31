package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[2][4];
        System.out.println("Digite notas 2 alunos em 4 provas:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Aluno " + (i+1) + ": ");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 2; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            System.out.printf("Média Aluno %d: %.1f\n", (i+1), soma / 4);
        }
        scanner.close();
    }
}