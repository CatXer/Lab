package com.serg.labs19;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// initial//
		double x = 1, sum = 0, slag = 1, f_x, df, count;
		int n;
		Scanner in = new Scanner(System.in);
		// input//
		System.out.print("Введите точность (0 - 100) %: ");
		count = in.nextDouble();
		if (count >= 0 && count <= 100)
			count = count / 100 * 20 + 1;
		else {
			System.out.println("Ошибка при вводе точности.");
			in.close();
			return;
		}
		in.close();
		// calculate end sum Tailor//
		for (n = 1; n <= count; n++) {
			slag *= x * Math.log(3) / n;
			sum += slag;
		}
		// calculate function F(x)//
		f_x = Math.pow(3, x) - 1;
		// difference calculation//
		df = f_x - sum;
		// print results//
		System.out.println("Последний шаг = " + (n - 1));
		System.out.println("Рекурентная сумма = " + sum);
		System.out.println("F(x) = " + f_x);
		System.out.println("Разница = " + df);
	}
}
