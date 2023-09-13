package interfacee;

public class Teste_Cliente_Premium {

	public static void main(String[] args) {
		
			Cliente_Premium c1 = new Cliente_Premium("Flávia");
			Cliente_Premium c2 = new Cliente_Premium("Nicolas");
			
			c1.contaCorrente();
			c1.contaPoupanca();
			c1.cartaoCreditoIlimitado();
			c1.ganhou();
			
			System.out.println("***********************************************************");
			
			c2.contaCorrente();
			c2.contaPoupanca();
			c2.cartaoCreditoIlimitado();
			c2.ganhou();
	}

}
