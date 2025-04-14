package desafios;

import java.util.ArrayList;

public class Desafio03 {
	
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5, 6, 8};
		ArrayList<Integer> duplicados = new ArrayList<>();
		
	    for (int i = 0; i < numeros.length; i++) {
	    	if (numeros[i] % 2 == 0) {
	    		duplicados.add(numeros[i]);
	    	}
	    }
	    
	    System.out.println(duplicados);
	}
}