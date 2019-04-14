package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_1 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int length, count3 = 0, countNeg = 0;
		double[] X;
		// input//
		System.out.print("Введите длинну массива: ");
		length = Math.abs(in.nextInt());
		X = new double[length];
		System.out.println("Запишите массив из " + length + " элементов:");

		for (int i = 0; i < length; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			X[i] = in.nextDouble();
			count3 += X[i] % 3 == 0 ? 1 : 0;
			countNeg += X[i] < 0 ? 1 : 0;
		}
		in.close();
		System.out.println("Вы ввели: " + Arrays.toString(X));
		System.out.println("В массиве [" + count3 + "] элемента делятся на 3 без остатка.");

		if (countNeg != 0) {
			System.out.print("Были найдены отрицательные элементы ->\n[");
			for (double val : X)
				if (val < 0)
					if (--countNeg == 0) {
						System.out.print(val + "]");
						break;
					} else
						System.out.print(val + ", ");

		} else
			System.out.println("Отрицательных элементов не нашлось.");
	}
}