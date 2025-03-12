package desafios;

import java.util.Scanner;
import java.util.Random;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int min = 1;
		int max = 10;

		int aleatorio = random.nextInt(max - min + 1) + min;

		System.out.println("Digite um número para tentar adivinhar o número escolhido: ");
		int num = sc.nextInt();

		if(num != aleatorio) {
			System.out.println("Número diferente! o número escolhido pela máquina foi: " + aleatorio);
		} else {
			System.out.println("Número correto!");
		}
		
		sc.close();
	}
	
}
