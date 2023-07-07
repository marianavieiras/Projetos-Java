package principal;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {
	private String nome;
	private String ID;
	private double preco;
	private Set<Supermercado> produtos = new HashSet<Supermercado> ();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

		
	// add produto somnte se não for igual
	public void addProduto (Supermercado produto) {
		if (produtos.contains(produto)) {
			System.out.println ("Prduto já se encontra no sistema");
		} else {
		produtos.add(produto);
		}
		}

	// Dois produtos sao iquais com o mesmo ID

	@Override
	public boolean equals(Object obj) {
		
		Supermercado p = (Supermercado)obj;
		if(this.getID().equals(p.getID())) {
			return true;
		} else {			
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getID().charAt(0);
	}
	
	
	// for aprimorado
	public void imprime () {
		for (Supermercado novo:  produtos) {
			String listar;
			listar = "\nID: " + novo.getID();
			listar += "\nProduto: " + novo.getNome();
			listar += "\nPreço: " +novo.getPreco();
			
			System.out.println (listar);
		}
		
	}
	
}
