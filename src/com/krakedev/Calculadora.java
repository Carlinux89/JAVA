package com.krakedev;

public class Calculadora {

	public double multiplicar(double valor1, double valor2) {

		double producto = valor1 * valor2;
		return producto;
	}

	public double dividir(double dividendo, double divisor) {

		double cociente = dividendo / divisor;
		return cociente;
	}

	public double promediar(double valor1, double valor2, double valor3) {

		double totalPromedio = (valor1 + valor2 + valor3) / 3;
		return totalPromedio;
	}
}
