package poo;

import java.util.Optional;


public class Option1 {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Flávia" , "Camila" , 31);
		
	    Optional<Cliente> clienteOptional = Optional.of(c1);
	    
	    
		clienteOptional.map(resposta -> resposta.getNome())
				.filter(clienteNome -> clienteNome.startsWith("F"))
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
	                                                    
	    System.out.println("\nNome do Cliente: " + clienteOptional.get().getNome());
		
	}

}
