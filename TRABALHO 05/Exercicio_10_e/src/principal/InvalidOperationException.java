package principal;

public class InvalidOperationException extends RuntimeException {
	private String mensagem;
	
	public InvalidOperationException(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}