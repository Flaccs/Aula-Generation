package poo;

public class Pessoa_Fisica extends Cliente {

			private float saldoConta;
		
			public Pessoa_Fisica(String nome, String sobrenome, int idade, float saldoConta) {
				super (nome, sobrenome, idade);
				this.saldoConta = saldoConta;
			
				}
			public float getSaldoConta() {
				return saldoConta;
			}
			public void setSaldoConta(float saldoConta) {
			this.saldoConta = saldoConta;
			}
	
			 @Override
				public void visualizar() {

					super.visualizar();
					System.out.println("Saldo em conta R$: " + this.saldoConta);
			

			 }
}
