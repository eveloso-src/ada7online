package ejercicios;

import java.util.Scanner;

public class Matrix {

	private static final int DIAS = 5;
	private static final int CANT_LOCALES = 2;

	public static void main(String[] args) {
		// 5 filas x cada dia de la semana
		// 2 locales x cada sucursal

		// en la matriz ventas voy a guardar la cantidad de ventas
		// por sucursal por dia
		int ventas[][] = new int[DIAS][CANT_LOCALES];

		char crucigrama[][] = new char[DIAS][CANT_LOCALES];

		// ventas[0][1] --> guarda las ventas del dia lunes para el local 2
		// ventas[4][0] --> guarda las ventas del dia viernes para el local 1

		Scanner sc = new Scanner(System.in);
		// carga de matriz
		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				System.out.println("Ingrese ventas local " + (j + 1) + " dia: " + (i + 1));
				ventas[i][j] = sc.nextInt();
			}
		}

		imprimirMatriz(ventas);

		crucigrama[0][0] = '-';
		crucigrama[0][1] = '-';
		crucigrama[1][0] = '|';
		crucigrama[1][1] = '|';
		crucigrama[2][0] = '|';
		crucigrama[2][1] = '|';
		crucigrama[3][0] = '|';
		crucigrama[3][1] = '|';
		crucigrama[4][0] = '-';
		crucigrama[4][1] = '-';

		int contador = 0;
		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				if (contador < 9) {
					contador++;
				} else {

				}
				System.out.print(crucigrama[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void imprimirMatriz(int[][] ventas) {
		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				System.out.print(ventas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
