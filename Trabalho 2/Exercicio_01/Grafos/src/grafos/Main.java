package grafos;

public class Main {
	public static void main(String[] args) {

      // receber tam
		Grafos grafinho = new Grafos (5);
		grafinho.Vizinhos(3, 2);
		grafinho.Vizinhos(1, 2);
		grafinho.Vizinhos (3, 4);
		grafinho.Vizinhos(4, 1);
		
		grafinho.Listar(1);
		grafinho.Listar(2);
		grafinho.Listar(3);
		grafinho.Listar(4);
		
		grafinho.Matriz();
}
}