package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.print("Digite um número (0 para parar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            contador++;

            System.out.print("Digite um número (0 para parar): ");
            numero = scanner.nextInt();
        }        

        System.out.println("Quantidade de números digitados: " + contador);

        scanner.close();
    }
}
