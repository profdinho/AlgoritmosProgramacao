package algoritmosprogramacao.repeticao;
// Objetivo: Ler um número inteiro positivo e calcular a soma de 1 até esse número.
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i; // soma = soma + i
        }

        System.out.println("Soma = " + soma);

        scanner.close();
    }
}