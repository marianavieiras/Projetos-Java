package exercicio3.ufop.com;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws Exception {
	        int fx = 0, temp1 = 1, temp2 = 2,x, fi =0;
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Adicione o valor de N: ");
	        x = teclado.nextInt();
	 	        if (x<3 && x > 0) {
	            if (x==1) {
	                System.out.println("F(1) = 1          (1)");
	            } else {
	                System.out.println("F(1) = 1          (1)");
	                System.out.println("F(2) = 2          (2)");
	            }
	        }else{
	            for (int i = 3; i <= x; i++) {
	 
	                fi = 2 * temp1 + 3 * temp2;
	                temp2 = temp1;
	                temp1 = fi;
	 
	                if (i==x) {
	                    fx = fi;
	                }
	            }
	            System.out.println("F(1) = 1   (1)");
	            System.out.println("F(2) = 2   (2)");
	            System.out.println("F(N) = "+ fx +"  (3)");
	 
	        }
	    }


}
