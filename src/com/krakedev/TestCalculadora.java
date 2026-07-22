package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora resul = new Calculadora();

		System.out.println("");
		System.out.println("\t===== TALLER: EJERCICIO CALCULADORA =====");
		System.out.println("");

		double resultadoM = resul.multiplicar(10, 5);
		System.out.println("\tEl resultado de multiplicar 10 * 5 es: " + resultadoM);

		double resultadoD = resul.dividir(10, 2);
		System.out.println("\tEl resultado de dividir 10 / 2 es: " + resultadoD);

		double resultadoP = resul.promediar(10, 8, 9);
		System.out.println("\tEl promedio total de 10, 8, 9 es: " + resultadoP);

		System.out.println("");
		resul.mostrarResultado();

	}

}
