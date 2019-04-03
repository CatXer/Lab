package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int zero_count = 0, m, j = 0;
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

		for (int i = 0; j < X.length && i < Z.length; i += 2) {
			double x = Z[i];
			if (x == 0)
				continue;
			X[j++] = x;
		}
		for (int i = 1; j < X.length && i < Z.length; i += 2) {
			double x = Z[i];
			if (x == 0)
				continue;
			X[j++] = x;
		}

		// Сортировка Шелла//
		for (int gap = Z.length / 2; gap > 0; gap /= 2) {
			// Do a gaped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already in gaped order
			// keep adding one more element until the entire array is
			// gap sorted
			for (int i = gap; i < Z.length; i++) {
				// add a[i] to the elements that have been gap sorted
				// save a[i] in temp and make a hole at position i
				double temp = Z[i];
				// shift earlier gap-sorted elements up until the correct
				// location for a[i] is found
				for (j = i; j >= gap && Z[j - gap] < temp; j -= gap)
					Z[j] = Z[j - gap];
				// put temp (the original a[i]) in its correct location
				Z[j] = temp;
			}
		}

		// Вывод результатов//

		System.out.println(
				"Был получен новый массив сначала из чётных, а потом нечётных индексов: \n" + Arrays.toString(X));
		System.out.println("Старый массив был отсортирован по убыванию: \n" + Arrays.toString(Z));
	}
}
