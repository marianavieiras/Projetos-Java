package principal;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
	Scanner teclado = new Scanner (System.in);
	Nomes Lista = new Nomes ();
	int op;
	int alt = 2;
	
	do {
		System.out.println ("Insira: ");
		System.out.println ("1- Para adicionar um nome ");
		System.out.println ("2- Para remover um nome ");
		System.out.println ("3- Para verficar um nome ");
		System.out.println ("4- Para remover todos os nomes da lista ");
		op = teclado.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("Adicione um nome nome: ");
			teclado.nextLine();
			Lista.addNome(teclado.nextLine());
			break;
		
		case 2:
			System.out.println("Digite o nome que deseja remover: ");
			teclado.nextLine();
			Lista.removeNome(teclado.nextLine());
			break;
		
		case 3:
			System.out.println("Digite o nome que deseja verificar: ");
			teclado.nextLine();
			boolean opcao = Lista.verificarNome(teclado.nextLine());
			
			System.out.println ("Verificação: "+opcao);
			break;
			
		case 4: 
			Lista.removeTodos();
			System.out.println ("Nomes removidos");
		
		default: 
			System.out.println ("Opção invalida");
		} 
		
		System.out.println ("1- Continuar \n2- Sair");
		alt = teclado.nextInt();
		} while (alt != 2);
	 
		
	
	}

}
