package com.ipartek.operaciones.main;

import com.ipartek.operaciones.util.Operaciones;

public class Main {

	public static void main(String[] args) {
		System.out.println(Operaciones.esPrimo(5));
		System.out.println(Operaciones.esPrimo(4));
		System.out.println(Operaciones.factorial(5, true));
		Operaciones.fibonacci(20);
		System.out.println("");
		Operaciones.mostrarDivisores(50);
		System.out.println("");
		Operaciones.mostrarDivisores(200, true);
		System.out.println("");
		Operaciones.mostrarPrimos(9, 40);
		System.out.println("");
		Operaciones.mostrarPrimos(45, 4);
		System.out.println("");
		System.out.println(Operaciones.potencia(3, 3));
	}

}
