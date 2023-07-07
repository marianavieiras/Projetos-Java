package principal;

import java.util.Scanner;
class Main {

	
	public static void main(String[] args) {
    
	    Scanner teclado  = new Scanner(System.in);
	    String nome = teclado.next();
	    double peso = teclado.nextDouble();
	    String th = teclado.next(); 
	    
	    Peixe p = new Peixe(nome, peso, th);
	    System.out.println(p.toString());
	    
	    nome = teclado.next();
	    peso = teclado.nextDouble();
	    String raca = teclado.next(); 
	    Cachorro dog = new Cachorro(nome, peso ,raca);
	
	    System.out.println(dog.toString());
	    teclado.close();
   
  }
}