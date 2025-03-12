package desafios;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorSeguro;

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.println("Digite seu sexo: (M ou F)");
		String sexo = sc.next().toUpperCase();

		System.out.println("Digite a quantidade de anos de experiência como motorista: ");
		int exp = sc.nextInt();

		if(idade < 25 && exp < 2 ) {
			if("M".equals(sexo)) {
				valorSeguro = 2000;
				System.out.println("O valor do seguro será de: R$" + valorSeguro);
			} else if("F".equals(sexo)) {
				valorSeguro = 1800;
				System.out.println("O valor do seguro será de: R$" + valorSeguro);
			} else {
				System.out.println("Sexo inválido. Tente novamente.");
			}
		} else {
			valorSeguro = 1200;
			System.out.println("O valor do seguro será de: R$" + valorSeguro);
		}

		sc.close();
	}
	
}
