package algoritmosprogramacao.matrizes;

public class Exercicio04 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = (i + 1) * 2;
        }
        System.out.print("Vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}