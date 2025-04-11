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
            int num = 3;
            int fim= n-1;
 
            
            for (int i = 0; i <= end; i++) {
                for (int j = 0; j <= end; j++) {
                    if(matrix[i][j]==0){
                        matrix[i][j] = num;
                        matrix[j][i] = num;
                    }
                    if(i==j){
                        matrix[i][j] = 1;
                    }
                    if(j==fim){
                        matrix[i][j]=2;
                        fim--;
                    }
                    
                }
                num=3;
            }
 
            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    row.append(String.format("%3d", matrix[i][j]));
                    if (j < n - 1) row.append(" ");
                }
                System.out.println(row);
            }
            System.out.println();
        }
        scanner.close();
    }
}