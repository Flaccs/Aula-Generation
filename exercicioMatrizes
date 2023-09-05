package arrays;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int matriz [][] = {{1 , 2, 3} , {4, 5, 6} , {7,8,9}};
		String diagPrincipal = "", diagSecundaria = "";
		 int somaDiagPrincipal=0 , somaDiagSecundaria=0;
		
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o numero da posição: (" + linha + "," + coluna + "): ");
				matriz[linha][coluna] = ler.nextInt();

	}
				
		}
			for(int linha = 0; linha < 3; linha++) {
				diagPrincipal+=matriz[linha][linha] + "";
				somaDiagPrincipal+=matriz[linha][linha];
				
			
				
				}
				
				for(int linha = 0; linha < 3; linha++) {
					diagSecundaria += matriz[linha][ 3 - 1 - linha] + " ";
					somaDiagSecundaria += matriz[linha][3 - 1 - linha];

	}
		
				
				System.out.println("\nElementos da Diagonal Principal:\n" + diagPrincipal);
				System.out.println("\nElementos da Diagonal Secundária:\n" + diagSecundaria);
				System.out.println("\nSomas dos elementos da diagonal primcipal:\n" + somaDiagPrincipal);
				System.out.println("\nSomas dos elementos da diagonal secundaria\n" + somaDiagSecundaria);




}
}
