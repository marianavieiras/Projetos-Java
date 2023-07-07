package principal;

import java.util.Scanner;

public class Exercicio_2_32 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		int [] num = new int[5];
		int negativo= 0;
		int positivo = 0;
		int zero = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Adicione o numero, podendo ser negativo, positivo ou zero: ");
			num[i] = teclado.nextInt();
			if(num[i] < 0) {
				negativo ++;
			} else if(num[i] > 0) {
				positivo++;
			} else if (num[i] == 0) {
				zero++;
			}
		}
		System.out.println("Total de numeros negativos: "+negativo);
		System.out.println("Total de numeros positivos: "+positivo);
		System.out.println("Total de numeros zeros: "+zero);
		teclado.close();
	}
}
