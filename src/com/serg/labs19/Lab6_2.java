package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		// инициализация//
		Scanner in = new Scanner(System.in);
		int countOdd = 0, newL = 0, n = 0;
		double Y[], rangeDown, rangeUp, Mid = 0;
		// ввод//
		System.out.print("Введите длинну массива: ");
		n = Math.abs(in.nextInt());
		if (n == 0) {
			System.out.println("Ошибка: вы ввели нулевую длинну.");
			in.close();
			return;
		}
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
		if (rangeUp < rangeDown) {
			rangeUp += rangeDown;
			rangeDown = rangeUp - rangeDown;
			rangeUp -= rangeDown;
		}
		System.out.println("Вы ввели массив: " + Arrays.toString(Y) + ";\nВы ввели диапозон: [" + rangeDown + ":"
				+ rangeUp + "];");

		in.close();
		System.out.println("Среднее арифметическое нечётных элементов = " + Mid);
		// Удаление элементов с дробной частью//
		int j = 0;
		for (int i = 0; i < Y.length; i++) {
			double el = Y[i];
			if (el % 1 != 0)
				continue;
			newL++;
			Y[j++] = el >= rangeDown && el <= rangeUp ? Mid : el;
		}
		// вывод ответа//
		System.out.print("В результате было удалено [" + (Y.length - newL)
				+ "] элементов с дробной частью и массив принял вид:\n[");
		for(int i = 0; i < newL-1; i++) 
			System.out.print(Y[i]+", ");
		System.out.print(Y[newL-1]+"]");
		
	}
}
