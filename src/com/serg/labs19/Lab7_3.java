package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		double[][] matrix;
		int n;
		double sumEven = 0;
		// input//
		System.out.print("Введите число строк и столбцов [n] для матрицы [n x n]:");
		n = in.nextInt();
		if (n == 0) {
			System.out.println("Ошибка: пустая матрица");
			in.close();
			System.exit(1);
		}
		// ввод матрицы//
		matrix = new double[n][n];

		for (int row = 0; row < n; row++)
			for (int m = 0; m < n; m++) {
				System.out.print("Элемент X[" + (row + 1) + "," + (m + 1) + "]= ");
				matrix[row][m] = in.nextDouble();
				if (row % 2 != 0 && m % 2 != 0)
					sumEven += matrix[row][m];
			}
		in.close();
		// Вывод матрицы //Поиск чётных произведений элементов строк// //
		System.out.println("Вы ввели следующую матрицу :");
		for (int row = 0; row < n; row++) {
			System.out.print("| ");
			for (double el : matrix[row])
				System.out.printf("%10.6f  ", el);
			System.out.println(" |");
		}
		System.out.println("Новая матрица :");
		// replacing upper triangle elements on sum//
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				if (j > i)
					matrix[i][j] = sumEven;
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
