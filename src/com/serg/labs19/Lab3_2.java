package com.serg.labs19;

import java.util.Scanner;

public class Lab3_2 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int M, N;
		double a, y = 0, p;
		// input//
		System.out.print("Введите предел -> M: ");
		M = in.nextInt();
		System.out.print("Введите предел -> N: ");
		N = in.nextInt();
		System.out.print("Введите параметр -> a:");
		a = in.nextDouble();
		in.close();
		// use double <for operator> for calculate y//
		for (int i = 1; i <= N; i++) {
			p = 1;
			for (int j = 2; j <= M; j++)
				p *= (j * j + 1.0) / i;
			y += i * i * p;
		}
		y *= a;
		// print y//
		System.out.printf("y = %1.4f ", y);
	}
}
