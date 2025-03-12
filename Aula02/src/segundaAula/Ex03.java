package segundaAula;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Desafio 03 - Calcular a media de um aluno
		
		Scanner sc = new Scanner(System.in);
		
		String continuar = "";
		
		while (!"nao".equals(continuar)) {
			System.out.println("Digite a primeira nota: ");
			Double nota1 = sc.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			Double nota2 = sc.nextDouble();
			
			System.out.println("Digite a terceira nota: ");
			Double nota3 = sc.nextDouble();
			
			Double media = (nota1 + nota2 + nota3) / 3;
		
			System.out.println("A media final do aluno e: " + String.format("%.2f", media));
			System.out.println("Deseja continuar? (Digite 'nao' para sair.) ");
			continuar = sc.next();
		}
		sc.close();
	}
}