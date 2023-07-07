package exercicio1.ufop.com;
import java.util.Scanner;

public class Main {

	 public static void ValorFinal(Caixa manicures []){
	       
		 for (int i = 0; i < manicures.length; i++) {
			 float valorpe = manicures[i].valor1()*manicures[i].pe();
			 float valormao = manicures[i].valor2()*manicures[i].mao();
			 float valorpodologa = manicures[i].valor3()*manicures[i].podologa(); 
			 float valorfinal = (valorpe + valormao + valorpodologa)/2;
			 
			        System.out.println("---------------------------");
	                System.out.println("Manicure: "+manicures[i].getNomeManicure());
	                System.out.println("Valor dos procediementos:");
	                System.out.println("Pé: "+valorpe );
	                System.out.println("Mão: "+valormao );
	                System.out.println("Podologa: "+valorpodologa);
	                System.out.println("--------------------------- ");
	                System.out.println("O valor final do caixa foi de: "+valorfinal);
	            }
	        }
	      
	 
	    public static void cadastraManicure(){
	        Caixa manicures[] = new Caixa[5];
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("------------Salão Sempre Bela------------- ");
	        for (int i = 0; i < 5; i++) {
	            int pe, mao, podologa, valor1, valor2, valor3;
	            String nome;
	           
	            System.out.println("Informe o nome da manicure: ");
	            nome = teclado.next();
	           
	            System.out.println("Informe quantos procedimentos de pés foram realizados: ");
	            pe = teclado.nextInt();
	            System.out.println("Respectivo valor: ");
	            valor1 = teclado.nextInt();
	      	 
	            System.out.println("Informe quantos procedimentos de maõs foram realizados: ");
	            mao = teclado.nextInt();
	            System.out.println("Respectivo valor: ");
	            valor2 = teclado.nextInt();
	            
	            System.out.println("Informe quantos procedimentos de podologia foram realizados: ");
	            podologa = teclado.nextInt();
	            System.out.println("Respectivo valor: ");
	            valor3 = teclado.nextInt();
	            System.out.println("________________________________________________________ ");
	 
	            Caixa funcionaria = new Caixa(nome, pe, mao, podologa, valor1, valor2, valor3);
	            manicures[i] = funcionaria;
	        }
	        ValorFinal(manicures);
	    }
	 
	 
	    public static void main(String[] args) throws Exception {
	        cadastraManicure();
	    }
}
