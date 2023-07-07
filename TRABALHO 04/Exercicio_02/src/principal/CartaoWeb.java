package principal;

public abstract class CartaoWeb {
	
	private String destinatario;
	private String remetente;

	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getRemetente() {
		return remetente;
	}


	public void setRemetente(String remetente) {
		this.remetente = remetente;
	} 
	
	public abstract void showMessage ();



}
