package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {
    	ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList("Ana", "Bianca", "Carla", "Carlo"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra para remover as palavras que contenham essa letra: ");
        char letra = Character.toLowerCase(sc.next().charAt(0));

        sc.close();

        System.out.println("Lista original: " + listaNomes);

        listaNomes.removeIf(nome -> nome.toLowerCase().contains(String.valueOf(letra)));

        if (listaNomes.isEmpty()) {
            System.out.println("Nenhum nome restante na lista apos a remocao");
        } else {
            System.out.println("Lista atualizada: " + listaNomes);
        }
    }
}