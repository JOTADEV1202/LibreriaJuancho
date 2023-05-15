package controller;

import model.Cliente;
import model.ColeccionLibros;

public class Main {

	public static void main(String[] args) {
		
		ColeccionLibros libro1 = new ColeccionLibros();
		libro1.setAutor("Mario Mendoza");
		libro1.setCategoria(null);
		
		Cliente juan = new Cliente();
		juan.searchBook(libro1);
		juan.reservateBook(libro1);
		juan.buyBook(libro1);
		juan.returnBook(libro1);
		
		System.out.println(juan);
		System.out.println(libro1);
	}

}
