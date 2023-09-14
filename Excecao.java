package poo2;

import java.util.Scanner;

public class Excecao {

	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int quantidadeRemedio = 0;
		int ml = 0;
		int resul = 0;
		
		try {
		System.out.println("Digite a quantidade do medicamento: ");
		quantidadeRemedio = ler.nextInt();
		
		System.out.println("Digite a dose do medicamento: ");
		ml = ler.nextInt();
		
		resul = quantidadeRemedio / ml;
			
		System.out.println("Quantidade correta: " + resul);
		
			}catch(RuntimeException a) {
				System.err.println("Exceção: " + a);
				System.out.println("Digite uma quantidade correta: ");
				
			
			
			}
			}

}
