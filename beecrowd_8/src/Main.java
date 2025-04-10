import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int an = n-1;
        int z = 0;
        int x = n;

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
            for (int j = 0; j < n; j++) {;
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
