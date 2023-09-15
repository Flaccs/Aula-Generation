	package poo;
	
	import java.util.Optional;
	
	public class Options {
	
		public static void main(String[] args) {
				String palavras = "Flávia";
				
				Optional<String> checaNulo = Optional.ofNullable(palavras);
				
				if (checaNulo.isPresent()) {
					System.out.println("O nome foi inserido com sucesso!");
				} else {
					System.out.println("O nome não foi inserido!");
	
				}
		}
		}
