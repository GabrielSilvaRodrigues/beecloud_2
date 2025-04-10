import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double [][] m = new double[12][12];
        DecimalFormat deci = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String t = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        sc.close();
        double soma = 0.0;
        for (int i = 0; i < 12; i++) {
            soma+= m[i][c];
        }
        if (t.equals("M")) {
            soma /= 12.0;
            System.out.println(deci.format(soma));
        } else {
            System.out.println(deci.format(soma));
        }
    }
}

