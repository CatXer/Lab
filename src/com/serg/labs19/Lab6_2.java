package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int countOdd = 0, n = 0, newN = 0;;
		double Y[], rangeDown, rangeUp, el, Mid = 0;
		System.out.print("Введите длинну массива: ");
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
		Mid /= countOdd;
		System.out.print("Введите нижнуюю границу диапозона: ");
		rangeDown = in.nextDouble();
		System.out.print("Введите верхнюю границу диапозона: ");
		rangeUp = in.nextDouble();
		System.out.println("Вы ввели массив: " + Arrays.toString(Y) + ";\nВы ввели диапозон: [" + rangeDown + ":"
				+ rangeUp + "];");
		in.close();
		System.out.println("Среднее арифметическое нечётных элементов = " + Mid + ";");
		for (int i = 0; i < n; i++) {
			el = Y[i];
			Y[i] = el >= rangeDown && el <= rangeUp ? Mid : el;
		}
		System.out.println("Элементы, принадлежащие иi+нтервалу [" + rangeDown + ":" + rangeUp
				+ "], были заменены средним арифметическим [" + Mid + "] и массив принял вид:\n" + Arrays.toString(Y));
		for (int i = 0; i < n; i++) {
			el = Y[i];
			if (el % 1 != 0)
				continue;
			
			Y[newN++] = el;
		}
		System.out.print("Было удалено [" + (n-newN) + "] элементов с дробной частью и массив принял вид:\n[");
		for (int i = 0; i < newN-1; i++)
			System.out.print(Y[i] + ", ");
		System.out.print(Y[newN-1] + "];");

	}
}
