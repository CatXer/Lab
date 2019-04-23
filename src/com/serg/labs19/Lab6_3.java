package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int zero_count = 0, m, k = 0, i;
		double[] X, Z;
		double temp;

		// ввод//
		System.out.print("Введите длину массива: ");
		m = Math.abs(in.nextInt());
		Z = new double[m];
		System.out.println("Запишите массив из " + m + " элементов:");

		for (i = 0; i < m; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			Z[i] = in.nextDouble();
			if (Z[i] == 0)
				zero_count++;
		}

		System.out.println("Вы ввели массив: " + Arrays.toString(Z));
		in.close();

		// Заполнение массива Xk//
		X = new double[m - zero_count];

		for (i = 0; i < Z.length; i += 2) {
			if (Z[i] == 0)
				continue;
			X[k++] = Z[i];
		}
		for (i = 1; i < Z.length; i += 2) {
			if (Z[i] == 0)
				continue;
			X[k++] = Z[i];
		}

		// Сортировка Шелла//
		int gap = Z.length / 2;
		while (gap > 0) {
			i = gap;
			while (i < Z.length) {
				temp = Z[i];
				k = i;
				while (k >= gap && Z[k - gap] < temp) {
					Z[k] = Z[k - gap];
					k -= gap;
				}
				Z[k] = temp;
				i++;
			}

			gap /= 2;
		}
		// Вывод результатов//

		System.out.println(
				"Был получен новый массив Xk из ненулевых элементов сначала из чётных, а потом нечётных индексов: \n"
						+ Arrays.toString(X));
		System.out.println("Старый массив Zm был отсортирован по убыванию: \n" + Arrays.toString(Z));
	}
}
