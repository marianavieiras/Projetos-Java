package plantas.ufop.com;
import java.util.Scanner;

public class Main {
	
	public static void Estoque(Plantas especie []) {
		int est_necessario;
		for (int j = 0; j<especie.length; j++) {
		if (especie[j].getEstoqueAtual() > especie[j].getEstoqueIdeal()) {
			est_necessario = especie[j].getEstoqueAtual() - especie[j].getEstoqueIdeal(); 
			System.out.println("Planta: "+especie[j].getNomePlanta());
			System.out.println("Comprar: "+est_necessario);
		}
			
		}
		
	}
	public static void CadastroPlanta() {
		Plantas especie[] = new Plantas [50];
		Scanner teclado = new Scanner(System.in);
	
		 System.out.println("------------Floricultura------------- ");
		for (int i=0; i<50; i++) {
			String nomeplanta;
			int estoqueAtual, estoqueIdeal;
			
			System.out.println ("Adicione o nome da planta: ");
			nomeplanta = teclado.next();
			
			System.out.println("Adicione o estoque ideal: ");
			estoqueIdeal = teclado.nextInt ();
			
			System.out.println ("Adicione o estoque atual: ");
			estoqueAtual = teclado.nextInt();
			System.out.println("________________________________________________________ ");
			
			 Plantas planta = new Plantas(nomeplanta, estoqueIdeal, estoqueAtual);
	         especie[i] = planta;

						
		}
		 Estoque (especie);
		
	}

	public static void main(String[] args) throws Exception {
		CadastroPlanta();
	}

}
