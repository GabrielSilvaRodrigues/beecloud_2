import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int[][] matrix = new int[n][n];
            int end = n - 1;
            int num1 = 1;
            int num = 1;

            // Preenche a matriz com potências de 2
            for (int i = 0; i <= end; i++) {
                for (int j = 0; j <= end; j++) {
                    matrix[i][j] = num;
                    num *= 2;
                }
                num = num1 * 2;
                num1 *= 2;
            }

            // Descobre o maior número da matriz
            int max = matrix[n - 1][n - 1];
            int T = String.valueOf(max).length(); // número de dígitos

            // Imprime a matriz formatada
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(String.format("%" + T + "d", matrix[i][j]));
                    if (j < n - 1) System.out.print(" ");
                }
                System.out.println();
            }

            System.out.println(); // linha em branco entre matrizes
        }

        scanner.close();
    }
}
