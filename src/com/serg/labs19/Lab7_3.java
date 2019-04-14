package com.serg.labs19;

import java.util.Scanner;

public class Lab7_3 {
	public static void main(String[] args) {
		// Инициализация //
		Scanner in = new Scanner(System.in);
		double[][] matrix;
		int n;
		double sumEven = 0;
		// Ввод //
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
		// Вывод матрицы //
		System.out.println("Вы ввели следующую матрицу :");
		for (int row = 0; row < n; row++) {
			System.out.print("| ");
			for (double el : matrix[row])
				System.out.printf("%10.6f  ", el);
			System.out.println(" |");
		}
		// вывод суммы
		System.out.println("Сумма элементов, стоящих в четных строках и четных столбцах : " + sumEven);
		// замена элементов выше главной диагонали на сумму//
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++)
				matrix[i][j] = sumEven;
		}
		// вывод новой матрицы
		System.out.println("Новая матрица :");
		for (int row = 0; row < n; row++) {
			System.out.print("| ");
			for (double el : matrix[row])
				System.out.printf("%10.6f  ", el);
			System.out.println(" |");
		}
	}
}
