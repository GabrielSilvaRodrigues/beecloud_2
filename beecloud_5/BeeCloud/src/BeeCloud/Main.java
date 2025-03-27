package BeeCloud;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args) {
        double v=0;
        double dado=0;
        DecimalFormat deci = new DecimalFormat("0.0000");
        double[] n = new double[100];
        for(int i=0; i<100; i++){
            while(v==0){
                Scanner ler = new Scanner(System.in);
                v = ler.nextDouble();
                dado = v;
            }
            n[i]=dado;
            dado=dado/2;
        }
        for(int i=0; i<n.length;i++){
            System.out.println("N["+i+"] = "+deci.format(n[i]));
        }
    }
    
}