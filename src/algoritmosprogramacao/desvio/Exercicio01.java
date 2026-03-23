package algoritmosprogramacao.desvio;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();
        if (!nome.equals("")) {
            System.out.println("Seja bem vindo " + nome);
        }
        System.out.println("FIM!");
                
    }
}
