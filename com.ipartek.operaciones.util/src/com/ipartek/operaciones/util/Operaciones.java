package com.ipartek.operaciones.util;
//Inicio de la clase "Operaciones"
public class Operaciones {

	public static boolean esPrimo(int numero) {
		//Método para sacar los números primos
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static long factorial(int numero, boolean mostrar){
		long resultado = 1;
		for(int i=1;i<=numero;i++) {
			// Dentro de las if no es necesario poner mostrar==true ya que la if ya es una condicional booleana
			if(mostrar && i<numero) {
				System.out.print(i+"x");
			}else if(mostrar) {
				System.out.print(i+"=");
			}
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void fibonacci (int numFactores) {
		int n1 = 0;
		int n2 = 1;
		int res = 0;
		System.out.print(n1 + ", " + n2 + ", ");
		for(int i=2;i<=numFactores;i++) {
			res = n1 + n2;
			n1 = n2;
			n2 = res;
			System.out.print(res + ", ");
		}
	}

	public static void mostrarDivisores (int numero) {
		System.out.print("Los números divisores de: " + numero + " son: ");
		for(int i=1; i<=numero; i++) {
			if(numero %i==0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public static void mostrarDivisores (int numero, boolean primo) {
		System.out.print("Los números divisores de: " + numero + " y que además son primos, son: ");
		for(int i=1; i<=numero; i++) {
			if(numero %i==0) {
				if (esPrimo(i)) {
					//Llamamos en esta if al método creado con anterioridad ya que este retorna solamente los valores primos de un número
					System.out.print(i + ", ");
				}
			}
		}
	}
	
	public static void mostrarPrimos (int num1, int num2) {
		if(num1<num2) {
			System.out.print("Los números primos entre " + num1 + " y " + num2 + " son: ");
			for (int i=num1; i<=num2;i++) {
				if(esPrimo(i)) {
					System.out.print(i + ", ");
				}
			}
		}else {
			System.out.print("Los números primos entre " + num2 + " y " + num1 + " son: ");
			for (int i=num1; i>num2;i--) {
				if(esPrimo(i)) {
					System.out.print(i + ", ");
				}
			}
		}
	}

	public static double potencia (int base, int potencia) {
		double resultado = 1.0;
		for(int i=0;i<potencia;i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	//Final de la clase "Operaciones"
}
