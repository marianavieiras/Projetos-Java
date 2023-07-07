package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculator cal= new Calculator();
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha uma opção: ");
		System.out.println("\n1.Divisão \n2.Log10");
		int op = teclado.nextInt();
		
		switch(op) {
			case 1:
				try {					
					System.out.println("Informe o primeiro valor:");
					double a = teclado.nextDouble();
					System.out.println("Informe o  segundo valor:");
					double b = teclado.nextDouble();
					System.out.println(cal.divisao(a, b));
				} catch (InputMismatchException e){
					System.out.println("Valor invalido");
					e.printStackTrace();
				} catch( InvalidOperationException e) {
					System.out.println("Ocorreu um erro");
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println("Informe um valor: ");
					double c = teclado.nextDouble();
					System.out.println(cal.log10(c));
				} catch (InputMismatchException e){
					System.out.println("Valor invalido.");
					e.printStackTrace();
				} catch( InvalidOperationException e) {
					System.out.println("Ocorreu um erro");
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Erro");
		}
	}
}
