package principal;

import java.util.Scanner;

public class Main {

	public static void main (String [] args) {
	Scanner teclado = new Scanner (System.in);
	Supermercado lista = new Supermercado ();
	int op;
	int alt = 2;
	
	do {
		System.out.println ("Digite: \n1-Para adicionar um produto \n2-Para imprimir os produtos");
		op = teclado.nextInt();
		switch (op) {
		case 1:
			System.out.println("Adicione o codigo de barras: ");
			teclado.nextLine();
			lista.setID(teclado.nextLine());
			System.out.println("Nome: ");
			lista.setNome(teclado.nextLine());
			System.out.println("Preço: ");
			lista.setPreco(teclado.nextDouble());
			lista.addProduto(lista);
			break;
			
		case 2:
			lista.imprime();
			break;
		
		default: 
			System.out.println ("Opção invalida");
		}
			System.out.println ("1- Continuar \n2- Sair");
			alt = teclado.nextInt();
			} while (alt != 2);
		 
	}
	}


