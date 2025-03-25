package metodosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Roupa> roupas = new ArrayList<>();
        int continuar = 1;

        while (continuar == 1) {
            Roupa roupa = new Roupa();
            
            System.out.println("Digite a marca da roupa: ");
            roupa.marca = sc.nextLine();

            System.out.println("Digite o tipo da roupa: ");
            roupa.tipo = sc.nextLine();

            System.out.println("Digite o tamanho da roupa: ");
            roupa.tamanho = sc.nextLine();

            System.out.println("Digite a quantidade dessa roupa em estoque: ");
            roupa.quantidade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o valor de uma unidade da roupa: R$");
            roupa.valor = sc.nextDouble();
            sc.nextLine();
            
            roupas.add(roupa); 

            int opcao = 0;
            do {
                System.out.println("\n\nO que deseja fazer?");
                System.out.println("--------------------------------------------");
                System.out.println("1 - Aumentar a quantidade de pecas em estoque.");
                System.out.println("2 - Diminuir a quantidade de pecas em estoque.");
                System.out.println("3 - Visualizar os dados sobre a peca.");
                System.out.println("4 - Finalizar e criar nova roupa.");
                System.out.println("5 - Sair e exibir todas as roupas.\n\n");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite a quantidade de pecas que serao adicionadas ao estoque: ");
                        int quantidadeAdicionar = sc.nextInt();
                        sc.nextLine();
                        roupa.aumentarQuantidade(quantidadeAdicionar);
                        System.out.println(quantidadeAdicionar + " peca(s) adicionada(s) ao estoque.");
                        System.out.println(roupa.toString());
                        System.out.println("Valor total do estoque: R$" + roupa.valorEstoque() + "\n\n");
                        break;

                    case 2:
                        System.out.println("Estoque atual: " + roupa.quantidade);
                        System.out.println("Digite a quantidade de pecas que serao retiradas do estoque: ");
                        int quantidadeRetirar = sc.nextInt();
                        sc.nextLine();
                        if (quantidadeRetirar > roupa.quantidade) {
                            System.out.println("Impossivel remover mais peças do que a quantidade de peças em estoque. Estoque atual: " + roupa.quantidade + ".\n\n");
                        } else {
                            roupa.diminuirQuantidade(quantidadeRetirar);
                            System.out.println(quantidadeRetirar + " peca(s) retirada(s) do estoque.");
                            System.out.println(roupa.toString());
                            System.out.println("Valor total do estoque: R$" + roupa.valorEstoque() + "\n\n");
                        }
                        break;

                    case 3:
                        System.out.println(roupa.toString());
                        System.out.println("Valor total do estoque: R$" + roupa.valorEstoque() + "\n\n");
                        break;

                    case 4:
                        System.out.println("Criando nova roupa...\n\n");
                        break;

                    case 5:
                        continuar = 0;
                        System.out.println("\nExibindo todas as roupas cadastradas:");
                        for (Roupa r : roupas) {
                            System.out.println(r.toString());
                            System.out.println("Valor total do estoque: R$" + r.valorEstoque() + "\n");
                        }
                        break;

                    default:
                        System.out.println("Opcao invalida digitada. Por favor, digite novamente.\n\n");
                        break;
                }
            } while (opcao != 4 && opcao != 5);
        }

        sc.close();
    }
    
}

