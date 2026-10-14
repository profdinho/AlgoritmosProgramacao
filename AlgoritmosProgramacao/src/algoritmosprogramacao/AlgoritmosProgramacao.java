package algoritmosprogramacao;

import java.util.Scanner;

public class AlgoritmosProgramacao {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//        int[] vetor = new int[8];
//        System.out.println("Digite 8 números:");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println("Digite o número da posição " + i);
//            vetor[i] = scanner.nextInt();
//        }
//        // Inverte trocando o primeiro com o último, e assim por diante
//        for (int i = 0; i < vetor.length / 2; i++) {
//            int temp = vetor[i];
//            vetor[i] = vetor[vetor.length - 1 - i];
//            vetor[vetor.length - 1 - i] = temp;
//        }
//        System.out.println("Vetor invertido:");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.print(vetor[i] + " ");
//        }
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        int[] vetor = new int[8];
//
//        System.out.println("Digite 8 números inteiros:");
//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = scanner.nextInt();
//        }
//        // Bubble Sort: a cada passada, o maior "flutua" para o final
//        for (int i = 0; i < vetor.length - 1; i++) {
//            for (int j = 0; j < vetor.length - 1 - i; j++) {
//                if (vetor[j] > vetor[j + 1]) {
//                    int temp = vetor[j];
//                    vetor[j] = vetor[j + 1];
//                    vetor[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("Vetor ordenado:");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.print(vetor[i] + " ");
//        }
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordena com Bubble Sort (necessário para a busca binária)
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("Digite o valor a buscar: ");
        int alvo = scanner.nextInt();

        // Busca binária
        int inicio = 0;
        int fim = vetor.length - 1;
        int posicao = -1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == alvo) {
                posicao = meio;
                break;
            } else if (vetor[meio] < alvo) {
                inicio = meio + 1;   // valor está à direita
            } else {
                fim = meio - 1;      // valor está à esquerda
            }
        }

        if (posicao != -1) {
            System.out.println("Valor encontrado no índice " + posicao);
        } else {
            System.out.println("Não encontrado");
        }

    }
    
}
