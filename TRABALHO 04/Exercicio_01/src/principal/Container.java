package principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Container {
	Form []vetor = new Form [3];
		
	public void print (int num) {
		System.out.println("Conteúdo: "+vetor[num].getNumero());
	}
	
	public void flush (Form f, int i) {
		vetor [i] = f;
		System.out.println("F: "+f.getNumero());
	}
	
	public void printTodos () {
		for (Form f: vetor) {
			System.out.println (" "+f.getNumero());
					}
	}
	public void printArquivo () throws IOException {
		File f1 = new File ("teste.txt");
		Writer wr = new FileWriter ("teste.txt");
		for (Form f: vetor) {
			wr.write(String.valueOf(f.getNumero()));
					}
		wr.close();
		}

	 
	
}
