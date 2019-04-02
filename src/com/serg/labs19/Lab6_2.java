package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		// инициализация//
		Scanner in = new Scanner(System.in);
		int countOdd = 0, newL = 0, length = 0;
		double Yn[], rangeDown, rangeUp, Mid = 0;
		// ввод//
		System.out.print("Введите длинну массива: ");
		length = Math.abs(in.nextInt());
		if (length == 0) {
			System.out.println("Ошибка: вы ввели нулевую длинну.");
			in.close();
			return;
		}
		Yn = new double[length];
		System.out.println("Запишите массив из " + length + " элементов:");
		for (int i = 0; i < length; i++) {
			System.out.print("Введите X" + (i + 1) + ":");
			Yn[i] = in.nextDouble();
			if (Yn[i] % 2 != 0) {
				Mid += Yn[i];
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
		System.out.println("Вы ввели массив: " + Arrays.toString(Yn) + ";\nВы ввели диапозон: [" + rangeDown + ":"
				+ rangeUp + "];");

		in.close();
		System.out.println("Среднее арифметическое нечётных элементов = " + Mid);
		// Удаление элементов с дробной частью//
		int j = 0;
		for (int i = 0; i < Yn.length; i++) {
			double n = Yn[i];
			if (n % 1 != 0)
				continue;
			newL++;
			Yn[j++] = n >= rangeDown && n <= rangeUp ? Mid : n;
		}
		// вывод ответа//
		System.out.println("В результате было удалено [" + (Yn.length - newL)
				+ "] элементов с дробной частью и массив принял вид:");
		System.out.print(Arrays.toString(Yn));
	}
}
