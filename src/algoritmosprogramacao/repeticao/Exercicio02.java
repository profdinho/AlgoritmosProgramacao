package algoritmosprogramacao.repeticao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int i = 1;
        System.out.println("Execução while");
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
        
        i = 1;
        System.out.println("Execução do-while");
        do {
            System.out.println(i);
            i++;
        }
        while (i <= numero);
        System.out.println("Execução for");
        for (i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}