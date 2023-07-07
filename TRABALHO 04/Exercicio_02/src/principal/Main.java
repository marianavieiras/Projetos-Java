package principal;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public ArrayList <CartaoWeb> c = new ArrayList <> ();
	public CartaoWeb proximo () {
		Random rand = new Random ();
		int i = rand.nextInt(3);
		return c.get(i);
		
	}
	
	public void cartaozinho (CartaoWeb c) {
		String destinatario = "Mariana"; 
		String remetente = "Ronaldo";
		if (c instanceof DiaDosNamorados) {
		DiaDosNamorados namorado = new DiaDosNamorados (destinatario, remetente, "12/06/2022"); 
		namorado.showMessage();}
		else if (c instanceof Natal) {		
		System.out.println ("____________________________________");
		Natal mamae = new Natal (destinatario, remetente, "25/12/2022"); 
		mamae.showMessage();}
		else if (c instanceof Aniversario) {
		
		Aniversario amiga = new Aniversario (destinatario, remetente, "26/07/2022"); 
		amiga.showMessage();
	}
	}
	

}
	


