package algoritmosprogramacao.matrizes;

public class Exercicio09 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
        System.out.println("Matriz identidade 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}