package exercicio5.ufop.com;
import java.util.Scanner;


public class Main {
public static void main (String[] args) throws Exception {
	Scanner teclado = new Scanner(System.in);
	
	int matriz [][] = new int [3][3];
	for (int i = 0; i <3; i++) {
		for (int j  = 0; j < 3; j++) {
			System.out.println ("Insira um numero inteiro: ");
			matriz [i][j]=teclado.nextInt(); 
		}		
	}
	
	for (int j = 0; j < 3; j++) {
        for (int i = 2 ; i >= 0; i--) {
           
                System.out.print(" "+matriz[i][j]);
               
            }
            System.out.println(" ");
        }
}
}
