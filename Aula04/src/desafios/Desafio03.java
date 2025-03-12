package desafios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do empréstimo: ");
		double valor = sc.nextDouble();
	
		System.out.println("Digite um número para escolher a quantidade de parcelas desejadas: ");
		System.out.println("1 - 6 Meses");
		System.out.println("2 - 12 Meses");
		System.out.println("3 - 24 Meses");
		int escolha = sc.nextInt();

		double valorFinal;

		switch (escolha) {
		case 1:
			valorFinal = valor * 1.05;
			System.out.println("O valor final do empréstimo com as taxas ficará em: R$" + valorFinal);
			break;
		case 2:
			valorFinal = valor * 1.1;
			System.out.println("O valor final do empréstimo com as taxas ficará em: R$" + valorFinal);
			break;
		case 3:
			valorFinal = valor * 1.2;
			System.out.println("O valor final do empréstimo com as taxas ficará em: R$" + valorFinal);
			break;
		default:
			System.out.println("Número de parcelas inválido. Tente novamente.");
		}

		sc.close();
	}
	
}
