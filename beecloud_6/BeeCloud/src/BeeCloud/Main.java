package BeeCloud;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int v=0;
        int x = 0;
        int npar=0;
        int nimpar=0;
        int[] n = new int[15];
        Scanner ler = new Scanner(System.in);
        for(int i=0; i<15; i++){
            v = ler.nextInt();
            n[i]=v;
        }
        int[] par = new int[15];
        int[] impar = new int[15];
        for(int i=0; i<n.length;i++){
            if( n[i] % 2 == 0){
                par[npar]=n[i];
                npar++;
            }else{
                impar[nimpar]=n[i];
                nimpar++;
            }
        }
        x = 0;
        for(int i=0; i<5; i++){
            if(par[i] != 0){
                System.out.println("par["+x+"] = "+par[i]);
                if(x==4){
                    x=0;
                }
                x++;
            }    
        }
        x = 0;
        for(int i=0; i<5;i++){
            if(impar[i] != 0){
                System.out.println("impar["+x+"] = "+impar[i]);
                if(x==4){
                    x=0;
                }
                x++;
            }    
        }
        x = 0;
        for(int i=5; i<impar.length;i++){
            if(impar[i] != 0){
                System.out.println("impar["+x+"] = "+impar[i]);
                x++;
                if(x==5){
                    x=0;
                }
            }    
        }
        x = 0;
        for(int i=5; i<par.length;i++){
            if(par[i] != 0){
                System.out.println("par["+x+"] = "+par[i]);
                x++;
                if(x==5){
                    x=0;
                }
            }    
        }
        Scanner scanner = new Scanner(System.in);
        
        int[] pares = new int[5];
        int[] impares = new int[5];
        int contPares = 0;
        int contImpares = 0;

        // Lendo 15 números
        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) { // Número par
                pares[contPares] = numero;
                contPares++;
                
                // Se o vetor de pares atingir 5 elementos
                if (contPares == 5) {
                    for (int j = 0; j < contPares; j++) {
                        System.out.println("par[" + j + "] = " + pares[j]);
                    }
                    contPares = 0; // Reinicia o contador de pares
                }
            } else { // Número ímpar
                impares[contImpares] = numero;
                contImpares++;
                
                // Se o vetor de ímpares atingir 5 elementos
                if (contImpares == 5) {
                    for (int j = 0; j < contImpares; j++) {
                        System.out.println("impar[" + j + "] = " + impares[j]);
                    }
                    contImpares = 0; // Reinicia o contador de ímpares
                }
            }
        }

        // Imprimindo os elementos restantes nos vetores
        for (int j = 0; j < contImpares; j++) {
            System.out.println("impar[" + j + "] = " + impares[j]);
        }
        
        for (int j = 0; j < contPares; j++) {
            System.out.println("par[" + j + "] = " + pares[j]);
        }

        scanner.close();
    }
    
}