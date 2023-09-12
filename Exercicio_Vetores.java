package arrays;

import java.util.Scanner;

public class ExerciciosVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner ler = new Scanner(System.in);
				
				int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
				int numero , encontrado=0;
				
				System.out.println("Digite o número que você deseja encontrar: ");
				numero = ler.nextInt();
				
				
		      for(int indice = 0; indice < 10; indice++) {
		    	  
		    	  if(vetorInteiros[indice] == numero) {
		    		  encontrado=1;
		    		  System.out.println("O número: " + numero + " está localizado na posição: " + indice );
		    		  
		    		
		    	  }
		    	  else {
		    		  if(indice==9 && encontrado==0) {
		    			  
				            System.out.println("O número: " + numero + " não foi encontrado.");

		    		  }

		           
		            
		            
		
				}
				

	}
}
}

	

