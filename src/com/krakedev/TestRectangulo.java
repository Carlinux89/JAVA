package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo pr = new Rectangulo();

		pr.setBase(4);
		pr.setAltura(2);
		double perimetroR = pr.calcularPerimetro();
		System.out.println("");
		System.out.println("\t+++++ PERIMETRO TRIANGULO +++++");
		System.out.println("");
		System.out.println("\t El perimetro del triangulo es: " + perimetroR);

	}

}
