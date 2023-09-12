package poo;

public class Pessoa_Juridica extends Pessoa_Fisica {
			
	

			private int telefone;
						
			public Pessoa_Juridica(String nome, String sobrenome, int idade, float saldoConta, int telefone) {
				super(nome, sobrenome, idade, saldoConta);
				this.telefone = telefone;
				
	}
			public int getTelefone() {
			return telefone;
			}
			public void setTelefone(int telefone) {
			this.telefone = telefone;
			}
	
			@Override
			public void visualizar() {

				super.visualizar();
				System.out.println("Telefone: " + this.telefone);
	
			}
	}


