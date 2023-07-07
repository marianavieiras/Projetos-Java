package principal;

import java.util.Scanner;
class Main {

	
	public static void main(String[] args) {
    
	    Scanner teclado  = new Scanner(System.in);
	    String nome = teclado.next();
	    String sexo = teclado.next(); 
	    double vd = teclado.nextDouble();
	    int an = teclado.nextInt();
	    int idade = teclado.nextInt();
	    
	    Cliente p = new Cliente(nome, vd, idade, sexo, an);
	    System.out.println(p.toString());
	
	
	    nome = teclado.next();
	    idade = teclado.nextInt();
	    sexo = teclado.next(); 
	    double sal = teclado.nextDouble();
	    String mat = teclado.next(); 
	    String ng = teclado.next(); 
	    Gerente jurandir = new Gerente(nome, idade, sexo, sal , mat, ng);
	
	    nome = teclado.next();
	    idade = teclado.nextInt();
	    sexo = teclado.next(); 
	    sal = teclado.nextDouble();
	    mat = teclado.next(); 
	    int qd = teclado.nextInt();
	    double vv = teclado.nextDouble();
	    
	    Vendedor ceitin = new Vendedor(nome, idade, sexo, sal , mat, qd, vv);
	
	    System.out.println(jurandir.toString());
	    System.out.println(ceitin.toString());
	
	    teclado.close();
	   
	  }
}
