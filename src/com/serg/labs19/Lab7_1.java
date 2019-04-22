package com.serg.labs19;

import java.util.Scanner;

public class Lab7_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int columns, rows;
		double multyple;
		boolean even = false;

		System.out.print("Введите число строк [n]: ");
		rows = Math.abs(in.nextInt());
		System.out.print("Введите число столбцов [m]: ");
		columns = Math.abs(in.nextInt());
		if (columns == 0 || rows == 0) {
			System.out.println("Ошибка: пустая матрица");
			in.close();
			return;
		}

		double[][] matrix = new double[rows][columns];
		for (int n = 0; n < rows; n++)
			for (int m = 0; m < columns; m++) {
				System.out.print("Элемент X[" + (n + 1) + "," + (m + 1) + "]= ");
				matrix[n][m] = in.nextDouble();
			}
		in.close();

		System.out.println("Вы ввели следующую матрицу :");

		for (int row = 0; row < rows; row++) {
			System.out.print(row+1+": |");
			for (double el : matrix[row])
				System.out.printf("%10.4f ", el);
			System.out.println(" |");
		}

		for (int row = 0; row < rows; row++) {
			multyple = 1;
			for (double num : matrix[row])
				multyple *= num;
			if (multyple % 2 == 0) {
				System.out.println(
						"В строке [" + (row + 1) + "] произведение элементов = " + String.format("%.2f", multyple));
				even = true;
			}
		}
		if(!even) System.out.println("Строк с чётным произведением не найдено.");
	}
}