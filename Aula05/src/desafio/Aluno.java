package desafio;

public class Aluno {
	double n1;
	double n2;
	double n3;
	double media;
	
	public double calcularMedia() {
		media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	public void informarSituacao() {
		if (media >= 7) {
			System.out.println("Aluno aprovado com media: " + media);
		} else if (media >= 5) {
			System.out.println("Aluno de recuperacao com media: " + media);
		} else {
			System.out.println("Aluno reprovado com media: " + media);
		}
	}
}
