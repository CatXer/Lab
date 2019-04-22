package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab9_2 {

	private static double[] X;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] Z;
		int m;
		System.out.print("Введите длину массива: ");
		m = Math.abs(in.nextInt());
		if (m != 0) {
			Z = new double[m];
			System.out.println("Запишите массив из " + m + " элементов:");
			for (int i = 0; i < m; i++) {
				System.out.print("Введите X" + (i + 1) + ":");
				Z[i] = in.nextDouble();
			}
			System.out.println("Вы ввели массив: " + Arrays.toString(Z));
			createX(Z);
			System.out.println(
					"И к нему есть доступ из исходной процедуры : \n"
							+ Arrays.toString(X));
		} else
			System.out.print("Вы указали нулевую длинну.");
		in.close();
	}

	public static void createX(double[] Z) {
		int zero_count = 0, k = 0;
		for (int i = 0; i < Z.length; i++)
			if (Z[i] == 0)
				zero_count++;

		X = new double[Z.length - zero_count];

		for (int i = 0; i < Z.length; i += 2) {
			if (Z[i] == 0)
				continue;
			X[k++] = Z[i];
		}
		for (int i = 1; i < Z.length; i += 2) {
			if (Z[i] == 0)
				continue;
			X[k++] = Z[i];
		}
		System.out.println(
				"Был получен новый массив Xk из ненулевых элементов сначала из чётных, а потом нечётных индексов: \n"
						+ Arrays.toString(X));
	}

}
