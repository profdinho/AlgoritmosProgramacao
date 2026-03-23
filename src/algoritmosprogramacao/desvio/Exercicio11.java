package algoritmosprogramacao.desvio;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Ano Não Bissexto");
        }

        scanner.close();
    }
}