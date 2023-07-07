package principal;

import java.util.Scanner;

public class Exercicio_2_30 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Adicione um numero inteiro com 5 digitos: ");
		int num = teclado.nextInt();
		int [] resto = new int [5];
		int comprimento = Contador (num);
		
		 if (comprimento == 5) {
			 for (int i = 0; i<5; i++) {
				 resto [i] = num % 10;
				 num = num /10;
			 }
			 System.out.printf("%d ", resto[4]);
			 System.out.printf("%d ", resto[3]);
			 System.out.printf("%d ", resto[2]);
			 System.out.printf("%d ", resto[1]);
			 System.out.printf("%d ", resto[0]);
			 
		 } else if (comprimento != 5) {
			 System.out.println("Seu numero não contem apenas 5 numeros");
		 }
		 teclado.close();
	}
	
	public static int Contador (int num) {
		int cont = 0;
		
		if (num == 0) {
			return 1;
		}
		while (num != 0) {
			num = num/10;
			cont ++;
		}
		
		return cont;
		
	}
	
}
