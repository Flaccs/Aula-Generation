package abstrata;

public  class Pessoa_Fisica extends Cliente {
		
	
		@Override
		public void nome() {
			System.out.println("Nome simples.");
		}
		@Override 
		public void sobrenome() {
			System.out.println("Sobrenome simples.");
		}
		
		public void cpf() {
			System.out.println("CPF: ");
