package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plato platoA;
		Plato platoB;
		Plato platoC;

		platoA = new Plato();
		platoB = new Plato();
		platoC = new Plato();

		System.out.println("***** PlatoA con valores sin asignar *****");
		System.out.println("");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		System.out.println("");

		System.out.println("***** PlatoB con valores sin asignar *****");
		System.out.println("");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		System.out.println("");

		System.out.println("***** PlatoC con valores sin asignar *****");
		System.out.println("");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoA.disponible);
		System.out.println("");

		// PLATO A
		platoA.nombre = "Hornado Quiteño";
		platoA.tipo = "Comida";
		platoA.precio = 6.75f;
		platoA.disponible = true;

		// PLATO B
		platoB.nombre = "Locro de Papa";
		platoB.tipo = "Sopa";
		platoB.precio = 4.50f;
		platoB.disponible = true;

		// PLATO C
		platoC.nombre = "Fritada";
		platoC.tipo = "Comida";
		platoC.precio = 7.50f;
		platoC.disponible = false;

		System.out.println("===== PlatoA con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + (platoA.disponible ? "Sí" : "No"));
		System.out.println("");

		System.out.println("===== PlatoB con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + (platoB.disponible ? "Sí" : "No"));
		System.out.println("");

		System.out.println("===== PlatoC con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + (platoC.disponible ? "Sí" : "No"));
		System.out.println("");
	}

}
