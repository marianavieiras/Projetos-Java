package exercicio10.ufop.com;

import java.util.Scanner;

public class Main { 
	private static boolean fatoracao(int i) {
	    if (i != 2 && i % 2 == 0) {
	        return true;
	    } else if (i != 3 && i % 3 == 0) {
	        return true;
	    } else if (i != 5 && i % 5 == 0) {
	        return true;
	    } else return i != 7 && i % 7 == 0;
	}
	
	public static void main(String[] args) {

    int numero, cont = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Adicione um numero: ");
    numero = teclado.nextInt();
    
    int div = numero;
     while ( div != 1) {
        for (int i = 2; i <= div; i++ ) {
            if (div % i == 0) {
                if (fatoracao(i)) break;
                cont++;
                div = div / i;
            }
        }
    }

    int[] numeros_primos = new int[cont];
    cont = 0;
    while (numero != 1) {
    	for (int i = 2; i <= numero; i++ ) {
            if (numero % i == 0) {
                if (fatoracao(i)) break;
                numero = numero / i;
                numeros_primos[cont] = i;
                cont++;
            }
        }
    }

    System.out.println("Os numeros primos são: ");
    for (int numeros: numeros_primos) {
        System.out.println(numeros);
    }

}


}

