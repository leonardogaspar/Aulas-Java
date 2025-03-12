package desafios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da compra: R$");
		double valor = sc.nextDouble();

		System.out.println("Digite o número de itens adquiridos: ");
		int qnt = sc.nextInt();

		if (valor >= 300 && valor < 500 || qnt >= 3 && qnt < 5) {
			double desconto = valor * 0.95;
			System.out.println("Valor final da compra com desconto de 5%: R$" + desconto);
		} else if (valor >= 500 && valor < 1000 || qnt >= 5) {
			double desconto = valor * 0.90;
			System.out.println("Valor final da compra com desconto de 10%: R$" + desconto);
		} else if (valor >= 1000) {
			double desconto = valor * 0.80;
			System.out.println("Valor final da compra com desconto de 20%: R$" + desconto);
		} else {
			System.out.println("Valor sem descontos. Total: R$" + valor);
		}
		
		sc.close();
	}
	
}
