package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        System.out.println("Matriz A 2x2:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Linha " + (i+1) + ": ");
            for (int j = 0; j < 2; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz B 2x2:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Linha " + (i+1) + ": ");
            for (int j = 0; j < 2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Matriz soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}