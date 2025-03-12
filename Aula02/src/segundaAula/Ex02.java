package segundaAula;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//Desafio 02 - Calcular juros compostos
			
		Scanner sc = new Scanner(System.in);
			
		String continuar = "";
			
		while (!"nao".equals(continuar)) {
			System.out.println("Digite o capital inicial: ");
			Double cap = sc.nextDouble();

			System.out.println("Digite a taxa de juros (% ao mes): ");
	        Double tax = sc.nextDouble();

	        System.out.println("Digite o numero de meses: ");
	        int mes = sc.nextInt();
	            
	        Double monT = (cap * Math.pow((1 + (tax / 100)), mes));
	            
	        System.out.println("Montante total a ser pago: " + String.format("%.2f", monT));
	        System.out.println("Deseja continuar? (Digite 'nao' para sair.) ");
	        continuar = sc.next();
		}
	    sc.close();
	}
}

