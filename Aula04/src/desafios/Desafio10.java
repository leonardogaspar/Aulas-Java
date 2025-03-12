package desafios;

import java.util.Scanner; 

public class Desafio10 { 
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

		int fat = 1;

		System.out.println("Digite um número inteiro e positivo para calcular o fatorial desse número: ");
		int num = sc.nextInt();

		for(int i = num; i > 1; i--) {
			fat = fat * i;
		} 

		System.out.println("O fatorial de " + num + " é: " + fat);
		sc.close(); 
	} 

}
