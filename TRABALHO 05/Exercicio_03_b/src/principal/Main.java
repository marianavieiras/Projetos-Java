package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main (String [] args) {

		List<Funcionario> lista = new ArrayList<Funcionario>();	
	Scanner teclado = new Scanner (System.in);
	Funcionario f1 = new Funcionario("M123", "Maria", 1200, "26/07/2000");
	lista.add(f1);
	Funcionario f2 = new Funcionario("A456", "Ana", 1300, "24/10/2008");
	lista.add(f2);
	Funcionario f3 = new Funcionario("N567", "Carlos", 1400, "06/08/2005");
	lista.add(f3);
	Funcionario f4 = new Funcionario("Q908", "Pedro", 1027, "05/07/2011");
	lista.add(f4);
	

     
	int op;
	int alt = 2;
	
	do {
		System.out.println("Digite para: ");
		System.out.println ("1- Ordenar (ordem crescente) os funcionarios pelo salario");
		System.out.println("2- Ordenar os funcionarios em ordem alfabetica");
		System.out.println("3- Exibir qual funcionario possui o maior salario e qual possui o menor");
		System.out.println("4- Exibir o funcionario mais experiente (mais antigo) e o menos experiente");
		op = teclado.nextInt();
	switch (op) {
	case 1:
		System.out.println("Ordenação por salario: ");
				
		   Collections.sort(lista, new Comparator<Funcionario>() {
		        public int compare(Funcionario o1, Funcionario o2) {
		            if (o1.getSalario() > o2.getSalario()) {
		                return 1;
		            } else if (o1.getSalario() < o2.getSalario()) {
		                return -1;
		            } else {
		                return 0;
		            }
		        }
		   });
		   for (int i = 0; i < lista.size(); i++) {
			   lista.get(i).imprime();
	        }
		   
		break;
		
	case 2:
		
		System.out.println("Ordenação por nome: ");
	    Collections.sort(lista, new Comparator<Funcionario>() {
              public int compare(Funcionario o1, Funcionario o2) {
                return o1.getNome().toUpperCase().compareTo (o2.getNome().toUpperCase());
            }
        });
		
		for (int i=0; i<lista.size(); i++) {
			lista.get(i).imprime();
		}
		break;
		
	case 3: 
		
        Funcionario min = Collections.min(lista, new Comparator<Funcionario>() {
              public int compare(Funcionario o1, Funcionario o2) {
                if (o1.getSalario() > o2.getSalario()) {
                    return 1;
                } else if (o1.getSalario() < o2.getSalario()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Menor salario: "+min.getNome()+" Salario: "+min.getSalario());
        
        Funcionario max = Collections.max(lista, new Comparator<Funcionario>() {
            public int compare(Funcionario o1, Funcionario o2) {
              if (o1.getSalario() > o2.getSalario()) {
                  return 1;
              } else if (o1.getSalario() < o2.getSalario()) {
                  return -1;
              } else {
                  return 0;
              }
          }
      });
		System.out.println("Maior salario: "+max.getNome()+" Salario: "+max.getSalario());
		break;
		
	case 4: 


        Funcionario maior = Collections.max(lista, new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                 return o1.getDataContratacao().toUpperCase().compareTo (o2.getDataContratacao().toUpperCase());
                }
            });
                
		System.out.println("Maior tempo de contratação: "+maior.getNome());
		System.out.println("Data de contratação: "+maior.getDataContratacao());

        Funcionario menor = Collections.min(lista, new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                 return o1.getDataContratacao().toUpperCase().compareTo (o2.getDataContratacao().toUpperCase());
                }
            });
                
		System.out.println("Maior tempo de contratação: "+menor.getNome());
		System.out.println("Data de contratação: "+menor.getDataContratacao());
		
		
		break;
	default:
		System.out.println ("Opção invalida");
		break;
	}
		
		

	

	System.out.println ("1- Continuar \n2- Sair");
	alt = teclado.nextInt();
	} while (alt != 2);
 
	}

	
	}
