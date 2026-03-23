package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida");

        scanner.close();
    }
}
