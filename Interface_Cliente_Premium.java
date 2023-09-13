package interfacee;

	public class Cliente_Premium extends Cliente implements Cliente_Bronze, Cliente_Ouro, Cliente_Prata {
	

			public Cliente_Premium(String nome) {
			super(nome);
			}
			
			@Override
			public void contaCorrente() {
				System.out.println("Conta Corrente.");
			}
			
			@Override
			public void contaPoupanca() {	
				System.out.println("Conta Poupança.");

			}
			
			@Override
			public void cartaoCreditoIlimitado() {
				System.out.println("Cartão de Crédito Ilimitado.");

			}
	
	
}
