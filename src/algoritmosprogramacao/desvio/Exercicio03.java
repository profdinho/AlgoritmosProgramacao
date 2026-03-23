package algoritmosprogramacao.desvio;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}