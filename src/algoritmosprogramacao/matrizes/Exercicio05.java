package algoritmosprogramacao.matrizes;
// Objetivo: Calcular soma e m�dia de 5 vendas em vetor.
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vendas = new double[5];
        System.out.println("Digite 5 valores de vendas:");
        for (int i = 0; i < 5; i++) {
            vendas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vendas[i];
        }
        System.out.printf("Soma total: %.2f\n", soma);
        System.out.printf("Média das vendas: %.2f\n", soma / 5);
        scanner.close();
    }
}