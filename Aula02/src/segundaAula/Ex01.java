package segundaAula;

import java.util.Scanner;

public class  Ex01 {
	public static void main(String[] args) {
		//Desafio 01 - Conversao de Celsius para Fahrenheit e Kelvin
		
		Scanner sc = new Scanner(System.in);
		
		String continuar = "";
		
		while (!"nao".equals(continuar)) {
			System.out.println("Digite a temperatura em graus Celsius: ");
		
			Double c = sc.nextDouble();
			Double f = (c * 9/5) + 32;
			Double k = c + 273.15;
		
			System.out.println("Temperatura em Fahrenheit: " + f + " || Temperatura em Kelvin: " + k);
			System.out.println("Deseja continuar? (Digite 'nao' para sair.) ");
			continuar = sc.next();
		}
		sc.close();
	}
}