package principal;

import java.io.IOException;

public class Main {
	public static void main ( String args []) throws IOException {
		Container obj = new Container ();
	    Form for1 = new Form (1);
	    Form for2 = new Form (2);
	    Form for3 = new Form (3);
	    
	    obj.vetor[0] = for1; 
	    obj.vetor[1] = for2;
	    obj.vetor[2] = for3;
	    
	    obj.print(2);
	    obj.flush(for1, 2);
	    obj.printArquivo();
	    obj.printTodos();
	    
	    
	}

}
