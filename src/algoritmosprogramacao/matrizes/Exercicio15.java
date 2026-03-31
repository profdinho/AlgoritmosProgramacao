package algoritmosprogramacao.matrizes;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        System.out.println("Digite matriz 3x3 (linha por linha):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Verificar simetria (i > j)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }
        if (simetrica) {
            System.out.println("Simétrica");
        } else {
            System.out.println("Não simétrica");
        }
        scanner.close();
    }
}