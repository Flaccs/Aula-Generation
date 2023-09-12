package poo2;

import java.util.Scanner;

import poo.Cliente;

public class Teste_Farmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Farmacia farmacia1 = new Farmacia("remedio", "desodorante", "protSolar" , "sabonete" , "maquiagem");
		Farmacia farmacia2 = new Farmacia("remedio2" , "desodorante2" , "protSolar2" , "sabonete2" , "maquiagem2");
		Farmacia farmacia3 = new Farmacia(null, null, null, null, null);
		
		
		farmacia1.visualizar();
		farmacia2.visualizar();
		
		System.out.println("Produtos: ");
		System.out.println("Escolha um remédio: ");
		farmacia3.setRemedios(ler.nextLine());
		System.out.println("Escolha um desodorante: ");
		farmacia3.setDesodorante(ler.nextLine());
		System.out.println("Escolha um protSolar: ");
		farmacia3.SetProtSolar(ler.nextLine());
		System.out.println("Escolha um sabonete: ");
		farmacia3.SetSabonete(ler.nextLine());
		System.out.println("Escolha uma maquiagem: ");
		farmacia3.SetMaquiagem(ler.nextLine());
		
	

		farmacia3.getRemedios();
		farmacia3.getDesodorante();
		farmacia3.getProtSolar();
		farmacia3.getSabonete();
		farmacia3.getMaquiagem();
		
		System.out.println(""+ farmacia3.getRemedios() +"\n"+ farmacia3.getDesodorante() +"\n"+ farmacia3.getProtSolar()+"\n"+ farmacia3.getSabonete()+"\n"+farmacia3.getMaquiagem());
		farmacia3.visualizar();
		
		
		}

}
