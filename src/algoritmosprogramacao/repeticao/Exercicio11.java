package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio11 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite outro número inteiro positivo: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("O primeiro número deve ser menor que o segundo número");
        }
    }
    
}
