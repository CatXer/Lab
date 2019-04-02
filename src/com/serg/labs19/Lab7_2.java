package com.serg.labs19;

import java.util.Scanner;

public class Lab7_2 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		double matrix[][], array[] = new double[3];
		double max, min, mid = 0;
		int rows, columns;
		
		System.out.print("Введите число строк [n]: ");
		rows = in.nextInt();
		System.out.print("Введите число столбцов [m]: ");
		columns = in.nextInt();
		if (columns == 0 || rows == 0) {
			System.out.println("Ошибка: пустая матрица");
			in.close();
			System.exit(1);
		}
		// ввод матрицы//
		matrix = new double[rows][columns];
		for (int n = 0; n < rows; n++)
			for (int m = 0; m < columns; m++) {
				System.out.print("Элемент X[" + (n + 1) + "," + (m + 1) + "]= ");
				matrix[n][m] = in.nextDouble();
			}
		in.close();
		// Вывод матрицы //Поиск чётных произведений элементов строк// //
		System.out.println("Вы ввели следующую матрицу :");
		min = max = matrix[0][0];
		for (int row = 0; row < rows; row++) {
			System.out.print("| ");
			for (double el : matrix[row]) {
				System.out.printf("%10.6f ", el);
				mid += el;
				if (el < min)
					min = el;
				if (el > max)
					max = el;
			}
			System.out.println(" |");
		}
		array[0] = min;
		array[1] = max;
		array[2] = mid / (rows * columns);
		System.out.println("В резултате работы алгоритма у матрицы были выявленны следующие характеристики:");
		System.out.println("Минимальный элемент матрицы = " + array[0]);
		System.out.println("Максимальный элемент матрицы = " + array[1]);
		System.out.println("Среднее арифметическое элементов матрицы = " + array[2]);
	}
}
