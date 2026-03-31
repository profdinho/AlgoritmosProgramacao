package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[][] transposta = new int[4][3];
        System.out.println("Digite matriz 3x4 (linha por linha):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Calcular transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Transposta 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}