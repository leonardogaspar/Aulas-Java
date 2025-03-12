package desafios;

import java.util.Scanner; 

public class Desafio09 { 
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 

		double num = 1;

		int qntImp = 0;
		int qntPar = 0;

		double somImp = 0;
		double somPar = 0;

		double mediaImp;
		double mediaPar;

		while (num != 0) {
			System.out.println("Digite um número para calcular a média dos números pares e impares digitados (Digite 0 para sair)");
			num = sc.nextDouble();

			if (num != 0) {
				if (num % 2 == 1) {
					System.out.println("Número impar digitado.");
					qntImp += 1;
					somImp += num;
				} else {
					System.out.println("Número par digitado.");
					qntPar += 1;
					somPar += num;
				}
			}
		}

		mediaImp = somImp / qntImp;
		mediaPar = somPar / qntPar;

		System.out.println("A média dos números pares é: " + mediaPar + " e a média dos números impares é: " + mediaImp);

		sc.close(); 
	} 

}
