package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();
        } while (senha != 1234);

        System.out.println("Acesso permitido");

        scanner.close();
    }
}
