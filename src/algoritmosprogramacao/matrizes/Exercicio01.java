package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.print("Elementos: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
