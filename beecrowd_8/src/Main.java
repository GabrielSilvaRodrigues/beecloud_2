import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int[][] matrix = new int[n][n];
            int start = 0;
            int end = n - 1;
            int num = 1;

            while (start <= end) {
                for (int i = start; i <= end; i++) {
                    for (int j = start; j <= end; j++) {
                        matrix[i][j] = num;
                    }
                }
                start++;
                end--;
                num++;
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
/*import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int y = 1;
        int u = 0;
        ArrayList<Integer> v = new ArrayList<>();
        while(y!=0){
            y = sc.nextInt();
            v.add(y);
            u++;
        }
        int[] t = new int[u];
        for(int i=0; i < t.length; i++){
            t[i] = v.get(i);
        }
        for(int s=0; s< t.length; s++){
            int n = 0;
            n = t[s];
            int an = n-1;
            int x = n;
            int z = 0;
            int[][] m = new int[n][n];
            while(x > 0) {
                for (int i = z; i < n; i++) {
                    for (int j = z; j < n; j++) {
                        if (i == z || j == z || i == an || j == an) {
                            if (m[i][j] == 0) {
                                m[i][j] = z + 1;
                            } else {
                                m[i][j] = m[i][j];
                            }
                        }
                    }
                }
                x--;
                z++;
                an--;
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                
                StringBuilder row = new StringBuilder();
                for (int g : m[i]) {
                    row.append(String.format("%3s", v));
                }
                System.out.println(row.toString());
            }
            
            System.out.println();
        }
        sc.close();
    }
}
*/