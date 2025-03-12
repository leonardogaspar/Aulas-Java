package desafios; 

import java.util.Scanner; 

public class Desafio06 { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite o primeiro lado do triângulo: "); 
		int ladoA = sc.nextInt();

		System.out.println("Digite o segundo lado do triângulo: "); 
		int ladoB = sc.nextInt(); 

		System.out.println("Digite o terceiro lado do triângulo: "); 
		int ladoC = sc.nextInt(); 

		if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) { 
			System.out.println("Triângulo válido."); 
		} else { 
			System.out.println("Triângulo inválido."); 
		} 

		sc.close(); 
	} 

}
