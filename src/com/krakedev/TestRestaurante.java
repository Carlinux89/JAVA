package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1;
		Restaurante rest2;
		
		rest1=new Restaurante();
		rest2=new Restaurante();
		
		System.out.println("====== Restaurante1 antes de asignar valores ====");
		System.out.println("");
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Dirección: "+rest1.direccion);
		System.out.println("Calificación: "+ rest1.calificacion+"\n");
		
		
		System.out.println("***** Restaurante2 antes de asignar valores *****");
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Dirección: "+rest2.direccion);
		System.out.println("Calificación: "+ rest2.calificacion+"\n");
		
		rest1.nombre="VacoYVaca";
		rest1.direccion="C.C. El Bosque";
//		rest1.calificacion=4.5f; //forma nativa
		rest1.calificacion=(float)4.5; // forma de casteo
//		rest1.calificacion=Float.parseFloat("4.5");
		
		System.out.println("===== Restaurante1 con valores seteados =====");
		System.out.println("");
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Dirección: "+rest1.direccion);
		System.out.println("Calificación: "+ rest1.calificacion+"\n");
		
		rest2.nombre="Menestras del Negro";
		rest2.direccion="Av. La Prensa";
		rest2.calificacion=(float)4.8;
		
		System.out.println("***** Restaurante2 con valores seteados *****");
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Dirección: "+rest2.direccion);
		System.out.println("Calificación: "+ rest2.calificacion);
		
	}

}
