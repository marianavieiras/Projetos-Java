package ufop.com.br;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		IntegerSet s1 = new IntegerSet();
		s1.insertElement(10);
		s1.insertElement(20);
		s1.insertElement(30);

		IntegerSet s2 = new IntegerSet();
		s2.insertElement(10);
		s2.insertElement(15);
		s2.insertElement(20);
		s2.insertElement(25);

		System.out.println("Conjunto 1=" + s1.toSetString());
		System.out.println("Conjunto 2=" + s2.toSetString());
		System.out.println("Interseção =" + s1.intersecction(s2).toSetString());
		System.out.println("União =" + s1.union(s2).toSetString());
		System.out.println ("-------------------------------------------");
		System.out.println("Conjunto 1 e Conjunto 2 iguais? " + s1.isEqualsTo(s2));

		IntegerSet s3 = new IntegerSet();
		s3.insertElement(30);
		s3.insertElement(10);
		s3.insertElement(20);
		System.out.println("Conjunto 1 e Conjunto 3 são iguais?" + s1.isEqualsTo(s3));

		s3.deletElement(20);
		System.out.println("Conjunto 1 e Conjunto 3 iguais? " + s1.isEqualsTo(s3));

		System.out.println("Conjnto vazio: " + new IntegerSet().toSetString());
	}
}



