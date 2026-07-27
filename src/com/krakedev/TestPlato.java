package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plato platoA;
		Plato platoB;
		Plato platoC;

		// aqui se aplica el metodo constructor creado con parametros
		platoA = new Plato("Encebollado", "Costa", 6.7f, true);
		platoB = new Plato("Caldo de patas", "Quito", 3.5f, true);
		platoC = new Plato("Bandera", "Mariscos", 8.90f, false);

		System.out.println("\n ***** PlatoA con valores asigandos por el método contructor *****");
		System.out.println("\t Nombre: " + platoA.getNombre());
		System.out.println("\t Tipo: " + platoA.getTipo());
		System.out.println("\t Precio: " + platoA.getPrecio());
		System.out.println("\t Disponible: " + platoA.isDisponible());
		System.out.println("");

		System.out.println("***** PlatoB con valores asignados por el método contructor *****");
		System.out.println("\t Nombre: " + platoB.getNombre());
		System.out.println("\t Tipo: " + platoB.getTipo());
		System.out.println("\t Precio: " + platoB.getPrecio());
		System.out.println("\t Disponible: " + platoB.isDisponible());
		System.out.println("");

		System.out.println("***** PlatoC con valores sin asignados por el método contructor *****");
		System.out.println("");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());
		System.out.println("");

		// PLATO A
		platoA.setNombre("Hornado Quiteño");
		platoA.setTipo("Comida");
		platoA.setPrecio(6.75f);
		platoA.isDisponible();

		// PLATO B
		platoB.setNombre("Locro de Papa");
		platoB.setTipo("Sopa");
		platoB.setPrecio(4.50f);
		platoB.isDisponible();

		// PLATO C
		platoC.setNombre("Fritada");
		platoC.setTipo("Comida");
		platoC.setPrecio(7.50f);
		platoC.isDisponible();

		System.out.println("===== PlatoA con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + (platoA.isDisponible() ? "Sí" : "No"));
		System.out.println("");

		System.out.println("===== PlatoB con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + (platoB.isDisponible() ? "Sí" : "No"));
		System.out.println("");

		System.out.println("===== PlatoC con valores asignados =====");
		System.out.println("");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + (platoC.isDisponible() ? "Sí" : "No"));
		System.out.println("");
	}

}
