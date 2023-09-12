package poo;

import java.util.Scanner;

public class Teste_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Cliente cliente1 = new Cliente("Emma", "Vieira", 30, 53, 1.6f);
		Cliente cliente2 = new Cliente("Lucas", "Vieira", 31, 78, 1.8f);
		Cliente cliente3 = new Cliente();
		
		cliente1.visualizar();
		cliente2.visualizar();
		
	
		System.out.println("Cadastre - se: ");
		System.out.println("Insira seu nome: ");
		cliente3.setNome(ler.nextLine());
		System.out.println("Insira seu Sobrenome: ");
		cliente3.setSobrenome(ler.nextLine());
		System.out.println("Insira sua Idade: ");
		cliente3.setIdade(ler.nextInt());
		System.out.println("Insira seu Peso: ");
		cliente3.setPeso(ler.nextInt());
		System.out.println("Insira sua Altura: ");
		cliente3.setAltura(ler.nextFloat());


		cliente3.getNome();
		cliente3.getSobrenome();
		
		System.out.println("" + cliente3.getNome() +""+ cliente3.getSobrenome() +"\n"+ cliente3.getIdade() +"\n"+ cliente3.getPeso() +"\n"+ cliente3.getAltura());
		cliente3.visualizar();

	}
		
}
