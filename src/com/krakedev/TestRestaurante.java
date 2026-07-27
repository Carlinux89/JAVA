package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurante rest1;
		Restaurante rest2;

		// aqui se aplica el metodo constructor creado con parametros
		rest1 = new Restaurante("KFC", "Condado Shopping", 3.5f);
		rest2 = new Restaurante("El Bongo", "Otavalo", 3f);

		System.out.println("\n ====== Restaurante1 con valores asigandos por el método contructor ====");
		System.out.println("\t Nombre: " + rest1.getNombre());
		System.out.println("\t Dirección: " + rest1.getDireccion());
		System.out.println("\t Calificación: " + rest1.getCalificacion() + "\n");

		System.out.println("***** Restaurante2 con valores asigandos por el método contructor *****");
		System.out.println("\t Nombre: " + rest2.getNombre());
		System.out.println("\t Dirección: " + rest2.getDireccion());
		System.out.println("\t Calificación: " + rest2.getCalificacion() + "\n");

		rest1.setNombre("VacoYVaca");
		rest1.setDireccion("C.C. El Bosque");
//		rest1.calificacion=4.5f; //forma nativa
		rest1.setCalificacion((float) 4.5); // forma de casteo
//		rest1.calificacion=Float.parseFloat("4.5");

		System.out.println("===== Restaurante1 con valores seteados =====");
		System.out.println("");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion() + "\n");

		rest2.setNombre("Menestras del Negro");
		rest2.setDireccion("Av. La Prensa");
		rest2.setCalificacion((float) 4.8);

		System.out.println("***** Restaurante2 con valores seteados *****");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}
