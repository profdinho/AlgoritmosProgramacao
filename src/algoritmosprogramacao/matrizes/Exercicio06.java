package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.print("Vetor invertido: ");
        for (int i = 7; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}