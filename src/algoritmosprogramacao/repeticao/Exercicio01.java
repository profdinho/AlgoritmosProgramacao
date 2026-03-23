package algoritmosprogramacao.repeticao;

public class Exercicio01 {
    public static void main(String[] args) {
        
        int numero = 1;
        System.out.println("Execução while");
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
        
        numero = 1;
        System.out.println("Execução do-while");
        do {
            System.out.println(numero);
            numero++;
        }
        while (numero <=10);
        System.out.println("Execução for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}