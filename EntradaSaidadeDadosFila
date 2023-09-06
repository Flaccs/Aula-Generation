package entradaeSaidaDados;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class EntradaeSaidaDados1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		List<String> lista = new ArrayList <String>();
		int opcao=4;
			
		fila.add("1. Adicionar cliente na fila.");
		fila.add("2. Listar todos os clientes.");
		fila.add("3. Retirar cliente da fila.");
		fila.add("0. Sair.");
		
		
		System.out.println("Menu\n");
		Iterator<String> iterator = fila.iterator();
		while(iterator.hasNext()){
			   System.out.println(iterator.next());
		}				
		while(opcao!=0){
			System.out.println("\nDigite a opção desejada: ");
			opcao = ler.nextInt();
			
			if(opcao==1) {		
			System.out.println("\nDigite o nome: ");
			lista.add(ler.next());
			System.out.println("\nFila:\n\n" + lista);
			System.out.println("\nCliente adicionado!");
			}
			if(opcao==0) {
				System.out.println("\nPrograma Finalizado!");
			}
			else {
			if(lista.isEmpty()) {
				System.out.println("\nA Fila está vazia!");
			}
			else {
				if(opcao==2) {
					System.out.println("\nLista de Clientes na Fila: \n\n" + lista);
					}
				if(opcao==3) {
					lista.remove(0);
					System.out.println("\nFila: \n\n" + lista + "\n\nO Cliente foi Chamado!");
				}
		}}
			
}}}
