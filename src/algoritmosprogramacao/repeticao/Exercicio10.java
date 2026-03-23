package algoritmosprogramacao.repeticao;

import java.util.Scanner;

/**
 *
 * @author dinho
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";
        do {
            
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.print("Deseja fazer outra tabuada (S) ou (N)? ");
            resposta = scanner.nextLine();
        }
        while(resposta.equals("S") || resposta.equals("s"));

        scanner.close();
    }
    
}
