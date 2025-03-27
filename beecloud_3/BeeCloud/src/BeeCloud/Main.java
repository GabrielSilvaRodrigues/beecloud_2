package BeeCloud;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int[] x = new int[20];
        Scanner ler = new Scanner(System.in);
        for(int i=0; i<20; i++){
            int dado = ler.nextInt();
            x[19-i] = dado;
        }
        for(int i=0; i<x.length;i++){
            System.out.println("N["+i+"] = "+x[i]);
        }
    }
    
}