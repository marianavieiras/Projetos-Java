package principal;

public class Aniversario extends CartaoWeb {
	private String Data;
	
	public Aniversario (String destinatario, String remetente,  String Data) {
		setDestinatario (destinatario);
		setRemetente (remetente);
		this.Data = Data;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		this.Data = data;
	}
	
	public void showMessage() {
	System.out.println("Para: " + super.getDestinatario() + "\nQue Deus continue te abençoando com muita paz, saúde e felicidades. Feliz Aniversario!!! " + "\nDe: " + super.getRemetente() +"\n"+ this.Data);
		  
	}
}

