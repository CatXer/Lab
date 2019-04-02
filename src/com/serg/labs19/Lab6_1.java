package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_1 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int length, count3 = 0, countNeg = 0;
		double[] arr;
		// input//
		System.out.print("Введите длинну массива: ");
		length = Math.abs(in.nextInt());
		arr = new double[length];
		System.out.println("Запишите массив из " + length + " элементов:");

		for (int i = 0; i < length; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			arr[i] = in.nextDouble();
			count3 += arr[i] % 3 == 0 ? 1 : 0;
			countNeg += arr[i] < 0 ? 1 : 0;
		}
		in.close();
		System.out.println("Вы ввели: " + Arrays.toString(arr));
		System.out.println("В массиве [" + count3 + "] элемента делятся на 3 без остатка.");

		if (countNeg != 0) {
			System.out.println("Были найдены отрицательные элементы ->");
			for (double v : arr)
				if (v < 0)
					System.out.print(v + " ");
		} else
			System.out.println("Отрицательных элементов не нашлось.");
	}
}