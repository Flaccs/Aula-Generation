package interfacee;

public class Cliente {
	
		private String nome;
		
		public Cliente(String nome) {
		this.nome = nome;
		}	
		public String getNome() {
		return nome;
		}
		public void setNome(String nome) {
		this.nome = nome;
		}
		public void ganhou() {
			System.out.println("Todos os clientes ganharam anuidade de conta grátis.");
		}
		
}
