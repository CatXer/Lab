package com.serg.labs19;

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		double start, end, step, x, y = 0, xMax = 0, yMax = 0;
		int count_x;
		// input//
		while (true) {
			System.out.print("Введите нижнюю границу: ");
			start = in.nextDouble();
			System.out.print("Введите верхнюю границу: ");
			end = in.nextDouble();
			// check input errors//
			if (start == end) {
				System.out.println("Error: invalid range (=0).");
				continue;
			} else if (end < start) {
				end += start;
				start = end - start;
				end -= start;
			}
			System.out.print("Введите количество точек N = ");
			count_x = Math.abs(in.nextInt());
			// end input//
			step = (end - start) / (count_x - 1);
			in.close();
			break;
		}
		// calculate the tabulating function//
		if (count_x != 0) {
			System.out.println("[" + count_x + "] значений f(x) на [" + start + " : " + end + "] ->");
			xMax = x = start;
			yMax = 3 * x + 2 * Math.sin(x) + 1;
			for (int i = 0; i < count_x; i++) {
				y = 3 * x + 2 * Math.sin(x) + 1;
				System.out.println(
						"[" + (i + 1) + "]\t  " + String.format("%.4f", x) + "\t  " + String.format("%.4f", y));

				if (y > yMax) {
					yMax = y;
					xMax = x;
				}
				x += step;
			}
			System.out.print("\n" + "Максимальное значение f(x) = " + String.format("%.4f", yMax) + " при x = "
					+ String.format("%.2f", xMax));
		} else
			System.out.println("Вы указали количество точек = 0, нет выбора.");

	}
}
