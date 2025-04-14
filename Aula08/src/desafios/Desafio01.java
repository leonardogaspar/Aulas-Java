package desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		String[] nomes = {"Ana", "Berenice", "Bianca", "Carla", "Carlo"}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra para filtrar os nomes que comecam com ela: ");
		char letraInicial = Character.toUpperCase(sc.next().charAt(0));
		
		sc.close();
		
		String sequencia = "";
		int contagem = 0;
		
		for(int i = 0; i < nomes.length; i++) {
			if (nomes[i].charAt(0) == letraInicial) {
				sequencia += nomes[i] + ", ";
				contagem ++;
			}
		}
		
		if (!sequencia.isEmpty()) {
			sequencia = sequencia.substring(0, sequencia.length() - 2);
		}
		
		System.out.println("Nomes encontrados que comecam com '" + letraInicial + "': " + sequencia);
		System.out.println("Total de nomes: " + contagem);
	}

}
