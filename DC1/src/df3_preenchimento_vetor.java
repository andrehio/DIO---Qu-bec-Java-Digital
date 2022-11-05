/*
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 
 * 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
 */
import java.util.Scanner; 

public class df3_preenchimento_vetor {
    
	public static void main(String[] args){ 
	    Scanner leitor = new Scanner(System.in);
	    final int tamanho = 1000;
	    
	    int t = leitor.nextInt(); 
	    leitor.close();
	    
	    int[] vetor = new int[tamanho];
	    
	    int i = 0;
	    while(i < tamanho) {
	    	for(int j = 0; j < t; j++) {
	    		if (i < tamanho) {
	    			System.out.printf("N[%d] = %d\n", i, j);
		    		i++;
	    		}
	    		else {
	    			break;
	    		}
	    	}
	    }
    }
}
