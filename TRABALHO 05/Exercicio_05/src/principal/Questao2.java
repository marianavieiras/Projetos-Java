package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {
	public static void main (String [] args) {
		
		System.out.println ("Eu sei dividir!");
		divisao();
	}
	
	public static void divisao(){

		Scanner teclado = new Scanner(System.in);
		try {
		System.out.println ("Informe o primeiro valor: ");
		int x = teclado.nextInt();
		System.out.println ("Informe o segundo valor: ");
		int y = teclado.nextInt();
		double r = (x / y);
		System.out.println("O resultado da soma é: "+ r);
	}catch (ArithmeticException e) {
        System.out.println("Operacao invalida!!!");
    } catch (InputMismatchException e) {
        System.out.println("Informe um numero inteiro valido");
        divisao();
    } catch (Exception e) {
        System.out.println("Erro inesperado!");
    }
	}
}
