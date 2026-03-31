package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Digite valores da matriz 3x3 (linha por linha):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Linha " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma linha " + (i+1) + ": " + soma);
        }
        scanner.close();
    }
}