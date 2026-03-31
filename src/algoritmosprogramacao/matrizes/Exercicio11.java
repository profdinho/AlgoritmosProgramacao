package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = scanner.nextInt();
        }
        // Bubble Sort crescente
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}