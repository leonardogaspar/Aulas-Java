package desafios;

import java.util.Scanner; 

public class Desafio08 { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 

		double num;
		int qntNum = 0;
		double somNum = 0;
		double media;

		do {
			System.out.println("Digite um número para calcular a média dos números digitados (Digite 0 para sair)");
			num = sc.nextDouble();

			if (num != 0) {
				qntNum += 1;
				somNum += num;
			}
		}
		while (num != 0);

		media = somNum / qntNum; 

		System.out.println("A média dos números digitados é: " + media);

		sc.close(); 
	} 

}
