package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        System.out.println("Matriz A 2x2 (linha por linha):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz B 2x2 (linha por linha):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        // Multiplicação C = A * B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matriz C:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}