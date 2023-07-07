package principal;

public class Main {

	public static void main(String[] args) {
		Numeros lista = new Numeros ();
		lista.add();
		System.out.println ("______________NUMEROS GERADOS_____________");
		lista.imprime();
		
		System.out.println ("\n\n______________MENOR E MAIOR_____________");
		lista.menorMaior();
		
		System.out.println ("\n\n______________NUMEROS ORDENADOS_____________");
		lista.ordena();
		
	}

}
