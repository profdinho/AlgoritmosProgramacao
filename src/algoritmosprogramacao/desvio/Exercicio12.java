package algoritmosprogramacao.desvio;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        double desconto;

        if (valor > 500) {
            desconto = 0.15;
        } else if (valor >= 200) {
            desconto = 0.10;
        } else {
            desconto = 0.05;
        }

        double valorFinal = valor - (valor * desconto);

        System.out.printf("Valor final: %.2f\n", valorFinal);

        scanner.close();
    }
}