package terceiraAula;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da fatura: ");
	    double valor = sc.nextDouble();
	    double valorFinal;

	    System.out.println("Selecione um metodo de pagamento:");
	    System.out.println("1. Cartao de credito (acrescimo de 10%)");
	    System.out.println("2. Cartao de debito (desconto de 5%)");
	    System.out.println("3. Boleto bancario (desconto de 8%)");
	    System.out.println("4. PIX (desconto de 3%)");

	    int opcao = sc.nextInt();

	    switch (opcao) {
	    	case 1:
	    			valorFinal = valor * 1.10;
	    			System.out.println("Voce escolheu cartao de credito. Valor final: " + valorFinal);
	    			break;
	    	case 2:
	    			valorFinal = valor * 0.95;
	    			System.out.println("Voce escolheu cartao de debito. Valor final: " + valorFinal);
	    			break;
	    	case 3:
	    			valorFinal = valor * 0.92;
	    			System.out.println("Voce escolheu boleto bancario. Valor final: " + valorFinal);
	    			break;
	    	case 4:
	    			valorFinal = valor * 0.97;
	    			System.out.println("Voce escolheu PIX. Valor final: " + valorFinal);
	    			break;
	    	default:
	    			System.out.println("Opcao invalida. Valor original: " + valor);
	    			break;
	    }
	    
	    sc.close();
	}
}

