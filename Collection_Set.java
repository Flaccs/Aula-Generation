package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class exercicioCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		Integer y = Integer.valueOf(10);
		Integer contador;
		
		for(contador= 1; contador <= 10; contador++) {			
			System.out.println("Digite " + contador + "º numeros: ");
			setNumeros.add(ler.nextInt());
		
		}
        for (Integer numero : setNumeros) {
            if (numero != null);
      
    	        }
		System.out.println("Listar dados do set: ");

        
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
	}

		
		

		
}}
