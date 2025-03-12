package desafios;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da moeda em que deseja converter o valor para: ");
		System.out.println("1 - Dólar (R$ 1 = US$ 0,20)");
		System.out.println("2 - Euro (R$ 1 = € 0,18)");
		System.out.println("3 - Libra (R$ 1 = £ 0,15)");
		int escolha = sc.nextInt();

		double valor;
		double resultado;

		switch (escolha) {
		case 1:
			System.out.println("Digite um valor em reais para converter para dólar : ");
			valor = sc.nextDouble();
			resultado = valor * 0.2;
			System.out.println("O valor convertido para dólar ficou em: US$" + resultado);
			break;
		case 2:
			System.out.println("Digite um valor em reais para converter para euro : ");
			valor = sc.nextDouble();
			resultado = valor * 0.18;
			System.out.println("O valor convertido para euro ficou em: €" + resultado);
			break;
		case 3:
			System.out.println("Digite um valor em reais para converter para libra : ");
			valor = sc.nextDouble();
			resultado = valor * 0.15;
			System.out.println("O valor convertido para libra ficou em: £" + resultado);
			break;
		default:
			System.out.println("Moeda escolhida inválida. Tente novamente.");
		}
		
		sc.close();
	}
	
}
