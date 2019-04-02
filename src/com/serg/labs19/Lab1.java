package com.serg.labs19;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		double a, b, c, x;
		// input data//
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите данные: ");
		System.out.print("a = ");
		a = inp.nextDouble();
		System.out.print("b = ");
		b = inp.nextDouble();
		System.out.print("c = ");
		c = inp.nextDouble();
		inp.close();
		// calculate x//
		x = (1.5 * Math.pow(a - b, 2)) / (Math.abs(a - b) * c) + Math.pow(10, 3) * Math.sqrt(Math.abs(a - b))
				- (2.5 * (Math.pow(a, 2) + 2.75) * Math.sin(-2 * a)) / (3 + Math.pow(a, 2) * b * c);
		System.out.printf("x = %1.4f", x);
	}
}
