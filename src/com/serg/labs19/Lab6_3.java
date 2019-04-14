package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int zero_count = 0, m, k = 0;
		double[] X, Z;

		// ввод//
		System.out.print("Введите длинну массива: ");
		m = Math.abs(in.nextInt());
		Z = new double[m];
		System.out.println("Запишите массив из " + m + " элементов:");

		for (int i = 0; i < m; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			Z[i] = in.nextDouble();
			if (Z[i] == 0)
				zero_count++;
		}

		System.out.println("Вы ввели массив: " + Arrays.toString(Z));
		in.close();

		// Заполнение массива Xk//
		X = new double[m - zero_count];

		for (int i = 0; k < X.length && i < Z.length; i += 2) {
			double x = Z[i];
			if (x == 0)
				continue;
			X[k++] = x;
		}
		for (int i = 1; k < X.length && i < Z.length; i += 2) {
			double x = Z[i];
			if (x == 0)
				continue;
			X[k++] = x;
		}

		// Сортировка Шелла//
		for (int gap = Z.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < Z.length; i++) {
				double temp = Z[i];
				for (k = i; k >= gap && Z[k - gap] < temp; k -= gap)
					Z[k] = Z[k - gap];
				Z[k] = temp;
			}
		}

		// Вывод результатов//

		System.out.println(
				"Был получен новый массив Xk из ненулевых элементов сначала из чётных, а потом нечётных индексов: \n"
						+ Arrays.toString(X));
		System.out.println("Старый массив Zm был отсортирован по убыванию: \n" + Arrays.toString(Z));
	}
}
