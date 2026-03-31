package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        int maior = vetor[0];
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        scanner.close();
    }
}