package principal;

public class Natal extends CartaoWeb {
			
		private String Data;
			
		public Natal (String destinatario, String remetente, String Data) {
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
			System.out.println("Para: " + getDestinatario() + "\nPapai Noel deixou o presente dabaixo da arvore e desejou um Feliz Natal HO-HO-HO !!!" + "\nDe: " + getRemetente() +"\n"+ this.Data);
			  
		}
	}


