package segundaAula;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//Desafio 04 - Calcular juros simples
			
		Scanner sc = new Scanner(System.in);
			
		String continuar = "";
			
		while (!"nao".equals(continuar)) {
			System.out.println("Digite o capital inicial: ");
			Double cap = sc.nextDouble();

			System.out.println("Digite a taxa de juros (% ao mes): ");
	        Double tax = sc.nextDouble();

	        System.out.println("Digite o numero de meses: ");
	        int mes = sc.nextInt();
	            
	        Double jur = cap * (tax / 100) * mes;
	        Double monT = cap + jur;
	        
	        System.out.println("Valor em juros: " + String.format("%.2f", jur) + " || Montante total a ser pago: " + String.format("%.2f", monT));
	        System.out.println("Deseja continuar? (Digite 'nao' para sair.) ");
	        continuar = sc.next();
		}
	    sc.close();
	}
}
