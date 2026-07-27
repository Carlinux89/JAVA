package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// aqui se aplica el metodo constructor creado con parametros
		Cuadrado c1 = new Cuadrado(8);
		Cuadrado c2 = new Cuadrado(2);
		Cuadrado c3 = new Cuadrado(5);

		System.out.println("\n +++++ Valores asigandos por medio del metodo constructor +++++ \n");
		System.out.println("\t    ***** AREA DEL CUADRADO *****");
		System.out.println("\t C1: Area del cuadrado: " + c1.calcularArea());
		System.out.println("\t C2: Area del cuadrado: " + c2.calcularArea());
		System.out.println("\t C3: Area del cuadrado: " + c3.calcularArea());

		System.out.println("\n\t    ***** PERIMETRO DEL CUADRADO *****");
		System.out.println("\t C1: Perimetro del cuadrado: " + c1.calcularPerimetro());
		System.out.println("\t C2: Perimetro del cuadrado: " + c2.calcularPerimetro());
		System.out.println("\t C3: Perimetro del cuadrado: " + c3.calcularPerimetro());

		c1.setLado(4);
		c2.setLado(3);
		c3.setLado(9);

		double area1 = c1.calcularArea();
		double area2 = c2.calcularArea();
		double area3 = c3.calcularArea();

		double perimetro1 = c1.calcularPerimetro();
		double perimetro2 = c2.calcularPerimetro();
		double perimetro3 = c3.calcularPerimetro();

		System.out.println("");
		System.out.println("\t    ***** AREA DEL CUADRADO *****\n");
		System.out.println("\t Area del cuadrado 1" + " de " + (c1.getLado()) + " lados: " + area1);
		System.out.println("\t Area del cuadrado 2" + " de " + (c2.getLado()) + " lados: " + area2);
		System.out.println("\t Area del cuadrado 3" + " de " + (c3.getLado()) + " lados: " + area3);

		System.out.println("");
		System.out.println("\t    ***** PERIMETRO DEL CUADRADO *****\n");
		System.out.println("\t Area del perimetro 1" + " de " + (c1.getLado()) + " lados: " + perimetro1);
		System.out.println("\t Area del perimetro 2" + " de " + (c2.getLado()) + " lados: " + perimetro2);
		System.out.println("\t Area del perimetro 3" + " de " + (c3.getLado()) + " lados: " + perimetro3);

	}

}
