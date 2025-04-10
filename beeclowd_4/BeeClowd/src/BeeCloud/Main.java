package BeeCloud;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int v=0;
        int dado=0;
        int x=0;
        int[] n = new int[1000];
        int[] sequencia = new int[1000];
        for(int i=0; i<1000; i++){
            while(v>51 || v<1){
                Scanner ler = new Scanner(System.in);
                v = ler.nextInt();
                dado = v;
            }
            if(x==dado){
                x=0;
                x++;
            }else{
                sequencia[i]=x;
                x++;
            }
            n[i]=sequencia[i];
        }
        for(int i=0; i<n.length;i++){
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
    
}