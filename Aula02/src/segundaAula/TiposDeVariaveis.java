package segundaAula;

import java.util.Arrays;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		// Variaveis primitivas
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 1000000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;

        // Variaveis de referencia
        String str = "Olá, Mundo!";
        int[] array = {1, 2, 3, 4, 5};

        // Exibindo as variaveis
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        System.out.println("Array: " + Arrays.toString(array));
	}

}
