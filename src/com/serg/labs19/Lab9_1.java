package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab9_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double X[];
		int n, result;
		System.out.print("Введите длинну массива X: ");
		n = Math.abs(in.nextInt());
		if (n != 0) {
			System.out.println("Запишате массив X из ["+n+"] элементов:");
			X = new double[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Введите X" + (i + 1) + ":");
				X[i] = in.nextDouble();
			}
			System.out.println("Вы ввели массив: " + Arrays.toString(X));
			result = getThreeCount(X);
			if (result != 0)
				System.out.print("В массиве X нашлось [" + result + "] элементов, делящихся на 3 без остатка.");
			else
				System.out.print("В массиве X не нашлось элементов, делящихся на 3 без остатка");
		} else
			System.out.print("Вы указали нулевую длинну.");
		in.close();
	}

	public static int getThreeCount(double[] X) {
		int result = 0;
		for (double val : X)
			if (val % 3 == 0)
				result++;
		return result;
	}

}
