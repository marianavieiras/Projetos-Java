package principal;

public class InvalidOperationException extends Exception {
	private String mensagem;
	
	public InvalidOperationException(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}