package principal;
import java.util.Scanner;

public class Exercicio_2_35 {
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Informe a quantidade total de milhas dirigidas por dia: ");
	        double milhas = teclado.nextDouble();

	        System.out.print("Informe o preço por galão de gasolina: ");
	        double gasolina = teclado.nextDouble();

	        System.out.print("Informe a média de milhas por galão: ");
	        double media = teclado.nextDouble();

	        System.out.print("Informe a taxa de estacionamento por dia: ");
	        double estacionamento = teclado.nextDouble();

	        System.out.print("Informe o valor do pedágio por dia: ");
	        double pedagio = teclado.nextDouble();

	        double custo = (milhas / media) * gasolina;
	        double total = custo + estacionamento + pedagio;

	        System.out.println("Custo diário para o trabalho:" + total);

	        teclado.close();
	    }
}

	    

