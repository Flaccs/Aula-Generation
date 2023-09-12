package exerciciosjava;

import java.util.Scanner;

public class Lacosderepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idade;
		int contador21=0, contador50=0;
		
		System.out.println("Digite uma idade:");
		idade = ler.nextInt();
		
		while(idade > 0) {
		if(idade < 21) {
			contador21 = contador21+1;		
		}
		if(idade>50) {
			contador50 = contador50+1;
		}

		System.out.println("Digite uma idade:");
		idade = ler.nextInt();
		}
				
		System.out.println("Total de pessoas menores de 21 anos: " + contador21 + "\nTotal de pessoas maiores de 50 anos: " + contador50);

				
				
		}
		
		

}	
