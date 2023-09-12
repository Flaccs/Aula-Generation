package poo;

import java.util.Scanner;

public class Teste_Cliente {

	public static void main(String[] args) {
		
		
		Pessoa_Juridica juridica1 = new Pessoa_Juridica("Emma" , "Vieira" , 31, 10000.00f, 995583012);
		Pessoa_Juridica juridica2 = new Pessoa_Juridica("Flávia" , "Camila", 31, 20000.00f, 910350301);
		Pessoa_Fisica fisica1 = new Pessoa_Fisica("Luiza", "Sonza", 29, 30000.00f);
		Pessoa_Fisica fisica2 = new Pessoa_Fisica("Britney", "Spears", 41, 1000000.00f);
		
	
				juridica1.visualizar();
				juridica2.visualizar();
				fisica1.visualizar();
				fisica2.visualizar();

	}
}
