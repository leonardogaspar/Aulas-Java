package desafio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite a primeira nota do aluno: ");
		aluno1.n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		aluno1.n2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		aluno1.n3 = sc.nextDouble();
		
		
		aluno1.calcularMedia();
		aluno1.informarSituacao();
		
		sc.close();

	}

}
