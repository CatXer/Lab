package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int countOdd = 0, n = 0, newN = 0;
		double Y[], rangeDown, rangeUp, el, Mid = 0;
		System.out.print("Введите длину массива: ");
		n = Math.abs(in.nextInt());
		Y = new double[n];
		System.out.println("Запишите массив из " + n + " элементов:");
		for (int i = 0; i < n; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			Y[i] = in.nextDouble();
			if (Y[i] % 2 != 0) {
				Mid += Y[i];
				countOdd++;
			}
		}
		System.out.println("Вы ввели массив: " + Arrays.toString(Y) + ";");
		if (countOdd != 0) {
			Mid /= countOdd;
			System.out.print("Введите нижнуюю границу диапозона: ");
			rangeDown = in.nextDouble();
			System.out.print("Введите верхнюю границу диапозона: ");
			rangeUp = in.nextDouble();
			System.out.println("Вы ввели диапозон: [" + rangeDown + ":" + rangeUp + "];");
			System.out.println("Среднее арифметическое нечётных элементов = " + String.format("%.5f", Mid) + ";");
			// замена попавших в интервал
			for (int i = 0; i < n; i++) {
				el = Y[i];
				Y[i] = el >= rangeDown && el <= rangeUp ? Mid : el;
			}
			System.out.println("Элементы, принадлежащие интервалу [" + rangeDown + ":" + rangeUp
					+ "], были заменены средним арифметическим [" + String.format("%.5f", Mid)
					+ "] и массив принял вид:\n" + Arrays.toString(Y));
			// удаление элементов с дробной частью
		}
		in.close();
		for (int i = 0; i < n; i++) {
			el = Y[i];
			if (el % 1 != 0)
				continue;
			Y[newN++] = el;
		}
		System.out.print("Было удалено [" + (n - newN) + "] элементов с дробной частью и массив принял вид:\n[");

		n = newN;
		for (int i = 0; i < n - 1; i++)
			System.out.print(Y[i] + ", ");
		System.out.print(Y[n - 1] + "];");

	}
}
