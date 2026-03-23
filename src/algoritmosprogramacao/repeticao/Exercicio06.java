package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número (0 para parar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;

            System.out.print("Digite um número (0 para parar): ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}
