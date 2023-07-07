package principal;

public class Test {


public static void main ( String args []) {
	
	 Main cartao = new Main () ;
	 Natal n = new Natal (null, null, null);
	 Aniversario a = new Aniversario (null, null, null);
	 DiaDosNamorados d = new DiaDosNamorados(null, null, null);
	 
	 cartao.c.add(n);
	 cartao.c.add(a);
	 cartao.c.add(d);
	 
	 cartao.cartaozinho(cartao.proximo());
	}	
}
