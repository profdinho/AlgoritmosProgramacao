package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros (serão ordenados):");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        // Ordenar vetor (Bubble Sort simples)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
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
        System.out.print("Digite o valor a buscar: ");
        int alvo = scanner.nextInt();
        int esquerda = 0, direita = 9, posicao = -1;
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (vetor[meio] == alvo) {
                posicao = meio;
                break;
            } else if (vetor[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        if (posicao != -1) {
            System.out.println("Encontrado na posição " + posicao);
        } else {
            System.out.println("Não encontrado");
        }
        scanner.close();
    }
}
