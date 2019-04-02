package com.serg.labs19;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		double x1, x2, x3, x4, a, b, y;
		// input data//
		System.out.print("x1 = ");
		x1 = in.nextDouble();
		System.out.print("x2 = ");
		x2 = in.nextDouble();
		System.out.print("x3 = ");
		x3 = in.nextDouble();
		System.out.print("x4 = ");
		x4 = in.nextDouble();
		in.close();
		// calculate a & b//
		a = x1 - x2;
		if (x1 + x2 < a)
			a = x1 + x2;
		if (x4 < a)
			a = x4;
		b = x2;
		if (x3 < b)
			b = x3;
		if (x4 < b)
			b = x4;
		if (b < x1)
			b = x1;
		if (b < x3 + x4)
			b = x3 + x4;
		// check on exceptions & calculate y//
		if (a + b < 0 || a * b < 0) {
			System.out.println("Error: Negative in root.");
			return;
		} else if (b == -1) {
			System.out.println("Error: Divided by zero.");
			return;
		} else
			y = (3 * Math.sqrt(a * b) - 4 * Math.sqrt(a + b)) / (b + 1);
		// print result//
		System.out.printf("y = %1.4f ", y);
	}

}
