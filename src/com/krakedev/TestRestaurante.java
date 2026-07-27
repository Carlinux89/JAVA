package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurante rest1;
		Restaurante rest2;

		rest1 = new Restaurante();
		rest2 = new Restaurante();

		System.out.println("====== Restaurante1 antes de asignar valores ====");
		System.out.println("");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion() + "\n");

		System.out.println("***** Restaurante2 antes de asignar valores *****");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion() + "\n");

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
