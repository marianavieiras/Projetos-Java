package principal;
import java.util.Scanner;

	public class Metodo {
		public static void main(String[] args) {
			try {			
				divisao();
			} catch(ArithmeticException e) {
				System.out.println("Valor inserido no denominador incorreto.");
			}
		}
		
		public static void divisao() throws ArithmeticException{
			Scanner teclado = new Scanner(System.in);
			try {
				System.out.println("Informe o primeiro valor: ");
				int a = teclado.nextInt();
				System.out.println("Informe o o segundo valor: ");
				int b = teclado.nextInt();
				System.out.println("O resultado "+ a/b);
			}catch (ArithmeticException e) {
		        System.out.println("Operacao invalida!!!");
			}
		}
	}
