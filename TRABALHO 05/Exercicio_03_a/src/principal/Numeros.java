package principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Numeros {
	// para gerar num aleatorios
	Random rand = new Random ();
	
	//Crie um ArrayList de inteiros, integer (classe empacotadoras)
	
	List <Integer> Lista = new ArrayList<Integer>();

	public void add(){
    for (int i = 0; i < 100; i++) {
        Lista.add(rand.nextInt(99));
    }
	}
    public void imprime () {
    	  for (int i = 0; i < 100; i++) {
              System.out.print(Lista.get(i)+" ");
          }
    }
	
    public void menorMaior () {
    	int min= Collections.min(Lista);
    	int max= Collections.max(Lista);
    	
    	System.out.println ("Menor valor: "+ min);
    	System.out.println ("Mair valor: "+ max);
    }
    
    public void ordena () {
    	Collections.sort(Lista);
  	  for (int i = 0; i < 100; i++) {
            System.out.print(Lista.get(i)+" ");
        }
    }
	}


