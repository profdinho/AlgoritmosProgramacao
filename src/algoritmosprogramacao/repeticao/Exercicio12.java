package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}