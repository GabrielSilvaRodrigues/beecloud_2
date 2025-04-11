package BeeCloud;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int v=51;
        int dado=0;
        int[] n = new int[10];
        for(int i=0; i<10; i++){
            while(v>50){
                Scanner ler = new Scanner(System.in);
                v = ler.nextInt();
                dado = v;
            }
            n[i]=dado;
            dado=dado*2;
        }
        for(int i=0; i<n.length;i++){
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
    
}