package principal;

public class DiaDosNamorados extends CartaoWeb{
	
	private String Data;
		
	public DiaDosNamorados (String destinatario, String remetente, String Data) {
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
	System.out.println  ("Para: " + super.getDestinatario() + "\nFeliz dia dos Namorados e não esqueça de lavar a louça hoje, Te amo!!" + "\nDe:" +super.getRemetente()+ "\n"+ this.Data);
		  
	}

}