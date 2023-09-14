package poo;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		private String nome;
		private String sobrenome;
		private int idade;
		private int peso;
		private float altura;
	
	//Atributos genéricos
	
	
		public Cliente(String nome, String sobrenome, int idade, int peso, float altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		
		// Métodos construtor com parâmetros
		
		
} 
		public Cliente() {
			// TODO Auto-generated constructor stub
		}
		public String getNome() {
		return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}	
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;	
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}	
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}	
		// Métodos Get e Set
		
		public void visualizar() {
			// TODO Auto-generated method stub
				
		}
		public void visualizar() {
		System.out.println("********************Cliente********************");
		System.out.println("Nome: " + this.nome);
	        System.out.println("Sobrenome: " + this.sobrenome);
      	        System.out.println("Idade: " + this.idade);
		System.out.println("Peso: " + this.peso);
	        System.out.println("Altura: " + this.altura);
		System.out.println("***********************************************");
			
		}
		
