package desafios;

public class Desafio02 {
	
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60};
        double soma = 0;
        int qntd = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            qntd++;
        }

        double media = soma / qntd;
        System.out.println("A média é: " + media);
    }
}