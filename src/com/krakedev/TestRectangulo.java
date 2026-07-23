package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo pr = new Rectangulo();

		pr.base = 4;
		pr.altura = 2;
		double perimetroR = pr.calcularPerimetro();
		System.out.println("");
		System.out.println("\t+++++ PERIMETRO TRIANGULO +++++");
		System.out.println("");
		System.out.println("\tEl perimetro del triangulo es: " + perimetroR);

	}

}
