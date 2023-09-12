package entradaeSaidaDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class EntradaeSaídadeDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		Stack<String> pilha1 = new Stack<String>();


		
		int opcao=4;
	
		pilha.push("1 - Adicionar Livro na pilha: ");
		pilha.push("2 - Listar todos os livros: ");
		pilha.push("3 - Retirar livro da pilha: ");
		pilha.push("0 - Sair. ");
		
		System.out.println("Menu\n");
		Iterator<String> iterator = pilha.iterator();
		while(iterator.hasNext()){
	    System.out.println(iterator.next());
		}
	    while(opcao!=0){
			System.out.println("\nDigite a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine();
	    
			   if(opcao==1) {
			   System.out.println("\nDigite o nome: ");
			   pilha1.push(ler.nextLine());
			   System.out.println("\nPilha:\n\n" + pilha1);
			   System.out.println("\nLivro adicionado!");
			   }
			   if(opcao==0) {
					System.out.println("\nPrograma Finalizado!");
			   }
			   if(pilha1.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
			   } else {
					if(opcao==2) {
						System.out.println("\n\nLista de livros na pilha:\n\n " + pilha1 );
					}
					if(opcao==3) {
						pilha1.pop()
;						System.out.println("\n\nUm livro foi retirado da pilha: \n\n" + pilha1);
						
						

					
	}
	}
}}

	

}
