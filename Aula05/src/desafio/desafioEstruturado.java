package desafio;

import java.util.Scanner;

public class desafioEstruturado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado com media: " + media);
		} else if (media >= 5) {
			System.out.println("Aluno de recuperacao com media: " + media);
		} else {
			System.out.println("Aluno reprovado com media: " + media);
		}
		
		sc.close();

	}

}
