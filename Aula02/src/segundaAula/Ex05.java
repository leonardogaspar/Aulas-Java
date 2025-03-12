package segundaAula;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//Desafio 05 - Calcular area e perimetro de um circulo
			
		Scanner sc = new Scanner(System.in);
			
		String continuar = "";
			
		while (!"nao".equals(continuar)) {
			System.out.println("Digite o raio do circulo: ");
			Double raio = sc.nextDouble();
	        
			Double area = Math.PI * Math.pow(raio, 2);
	        Double perimetro = 2 * Math.PI * raio;
	            
	        System.out.println("Area do circulo: " + String.format("%.2f", area));
	        System.out.println("Perimetro do circulo: " + String.format("%.2f", perimetro));
	        System.out.println("Deseja continuar? (Digite 'nao' para sair.) ");
	        continuar = sc.next();
		}
	    sc.close();
	}
}
