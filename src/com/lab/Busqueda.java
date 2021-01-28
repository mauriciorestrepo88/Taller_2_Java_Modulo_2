package com.lab;

import java.util.Scanner;

public class Busqueda {

	public int[] vector = { 2, 5, 9, 58, 36, 78, 84, 20, 10, 100 };

	public int[] ordenarVector() {
		int x, i;

		for (x = 0; x < vector.length - 1; x++) {

			for (i = 0; i < vector.length - 1 - x; i++) {

				if (vector[i] > vector[i + 1]) {
					int aux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = aux;
				}

			}
			
		}
		return vector;
	}

	public void imprimirVector() {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Arreglo posicion " + i + " valor " + vector[i]);
		}
	}

	
	public boolean binaria(int  vector[] , int clave) {
		int central, valorcentro, valorinicial, valorfinal;
		valorinicial = 0;
		valorfinal = vector.length - 1;
		int contador = 0;
		while (valorinicial <= valorfinal) {
			contador++;
			System.out.println("iteración "+contador);
			central = (valorinicial + valorfinal) / 2;
			valorcentro = vector[central];
			if (clave == valorcentro) {
				System.out.println("La clave se encontró en el vector, en el indice "+" "+ central);
				return true;
			} else if (clave < valorcentro) {
				valorfinal = central - 1;
			} else {
				valorinicial = central + 1;
			}
		}
		System.out.println("La clave  no se encontró en el vector");
		return false;

	}
	
		
	}
	 

