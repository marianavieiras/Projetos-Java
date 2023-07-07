package grafos;

public class Grafos {

	private boolean[][] posicao;
	
	public Grafos (int tam) {
	 posicao = new boolean [tam][tam];
	}
	//definir vizinhos
	public void Vizinhos (int num1, int num2) {
		if (posicao[num1][num2] ==  true || num1 == num2) {
			System.out.println ("Posições invalidas!!!");
		} else {
			posicao [num2][num1] = true;
			posicao [num1][num2] = true;
		}
	}
 
  //listar vizinhos 
	public void Listar (int vertice) {
		System.out.println("Vizinhos: ");
		for (int i= 0; i<posicao.length; i++) {
			if (posicao[vertice][i] == true) {
							System.out.println(i);
			}
		}
	}
 
 //mostrar matriz
	public void Matriz () {
		String num = ""; 
		for (int i = 0; i<posicao.length; i++) {
			num += "\n";
			for (int j = 0; j<posicao.length; j++) {
				if (this.posicao[i][j] == true) {
					num += 1 + " ";
				}
				if (this.posicao[i][j] == false) {
					num += 0 + " ";
				}
				//System.out.print(posicao[i][j]);
			}		
		
		}
		System.out.print(num);
	}
	
}
