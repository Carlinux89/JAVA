package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		c1.lado = 4;
		c2.lado = 3;
		c3.lado = 9;

		double area1 = c1.calcularArea();
		double area2 = c2.calcularArea();
		double area3 = c3.calcularArea();

		double perimetro1 = c1.calcularPerimetro();
		double perimetro2 = c2.calcularPerimetro();
		double perimetro3 = c3.calcularPerimetro();

		System.out.println("");
		System.out.println("\t    ***** AREA DEL CUADRADO *****\n");
		System.out.println("\t Area del cuadrado 1" + " de " + (c1.lado) + " lados: " + area1);
		System.out.println("\t Area del cuadrado 2" + " de " + (c2.lado) + " lados: " + area2);
		System.out.println("\t Area del cuadrado 3" + " de " + (c3.lado) + " lados: " + area3);

		System.out.println("");
		System.out.println("\t    ***** PERIMETRO DEL CUADRADO *****\n");
		System.out.println("\t Area del perimetro 1" + " de " + (c1.lado) + " lados: " + perimetro1);
		System.out.println("\t Area del perimetro 2" + " de " + (c2.lado) + " lados: " + perimetro2);
		System.out.println("\t Area del perimetro 3" + " de " + (c3.lado) + " lados: " + perimetro3);

	}

}
