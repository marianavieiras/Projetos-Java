package principal;

import java.util.Scanner;

public class Exercicio_2_16 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Adicione um numero inteiro: "); 
		int num1 = teclado.nextInt();
		System.out.println("Adicione o segundo nmero interio: ");
		int num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.printf("%d is langer", num1);
		} else if (num2 > num1) {
			System.out.printf("%d is langer", num2);
		} else if (num1 == num2) {
			System.out.println("These numbers are equal");
		}
		teclado.close();
	}
}
