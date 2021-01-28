package com.lab;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {

		Ordenamiento ord = new Ordenamiento();

		Busqueda bs = new Busqueda();

		System.out.println("********PRIMER PUNTO********");

		ord.imprimir();

		ord.insercion();

		ord.imprimir();

		System.out.println("********SEGUNDO PUNTO********");

		int[] vectorordenado = bs.ordenarVector();

		bs.imprimirVector();

		// Se envía como parámetro el vector ordenado y el dato a buscar
		bs.binaria(vectorordenado, 2);

	}

}
