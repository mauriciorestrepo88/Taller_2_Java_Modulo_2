package com.lab;

public class Ordenamiento {

	public int[] numeros = { 50, 20, 40, 80, 30, 2, 5, 100, 14 };

	public void imprimir() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Arreglo posicion " + i + " valor " + numeros[i]);
		}
	}

	public void seleccion() {
		int i, j;
		int indiceMenor;

		for (i = 0; i < numeros.length - 1; i++) {

			indiceMenor = i;

			for (j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[indiceMenor]) {

					indiceMenor = j;

				}

			}

			if (i != indiceMenor) {
				int aux = numeros[i];
				numeros[i] = numeros[indiceMenor];
				numeros[indiceMenor] = aux;
			}

		}
	}

	public void burbuja() {
		int pasada, i;

		for (pasada = 0; pasada < numeros.length - 1; pasada++) {

			for (i = 0; i < numeros.length - 1 - pasada; i++) {

				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
				}

			}

		}
	}

	// Se realiza busqueda elemento, por el método de inserción
	public void insercion() {

		System.out.println("ordenar");

		int ordenado, x;
		for (int i = 1; i < numeros.length; i++) {
			ordenado = numeros[i];
			x = i - 1;
			while (x > -1 && numeros[x] > ordenado) {
				numeros[x + 1] = numeros[x];
				x = x - 1;
			}
			numeros[x + 1] = ordenado;
		}

	}

}
