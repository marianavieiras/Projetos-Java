package exercicio4.ufop.com;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
float vendas [][] = new float [12][4];

for (int i=0; i<12; i++){
	for (int j=0; j<4; j++) {
		System.out.println("Insira o valor vendido na semana : ");
		vendas [i][j] = teclado.nextInt();
	}
}
somatoria (vendas);
}
	
	
public static void somatoria (float vendas [][]) {
	int semanax = 1, mesx=1;
	float SomaMes = 0;
	float SomaAno = 0;
	for (int i=0; i<12; i++){
		for (int j=0; j<4; j++) {
			System.out.println("O valor vendido na semana: "+semanax+" foi de: "+vendas[i][j]);
			SomaMes += vendas [i][j];
			semanax++;
					}
		System.out.println("O valor vendido no mes: "+mesx+" foi de: "+SomaMes);
		SomaAno += SomaMes;
		mesx++;
		System.out.println("------------------------------------------");
		}
	System.out.println("O VALOR VENDIDO NO ANO FOI DE: "+SomaAno);
	System.out.println("_____________________________________________");
	
}

}
