package formas;

public class FormaGeometrica {
	private String forma;
	
	protected FormaGeometrica(String forma) {
		this.forma = forma;
	}
	
	public void criar() {
		System.out.println("Forma geometrica "+this.forma+"\n");
	}

}
