package com.serg.labs19;

import java.util.Scanner;

public class Lab3_1c {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int M, N, i = 0;
		double a, result, p = 1, s1 = 0, s2 = 0;
		// input//
		System.out.print("Введите предел -> M: ");
		M = in.nextInt();
		System.out.print("Введите предел -> N: ");
		N = in.nextInt();
		System.out.print("Введите параметр -> a:");
		a = in.nextDouble();
		in.close();
		// use <do{}while operator> for calculate p & s1 & s2//
		do {
			p *= 2 * i / (a + M - 1);
			s2 += i + 3 - N;
			i++;
		} while (i <= M);
		i = 1;
		do {
			s1 += i * i - 1;
			i++;
		} while (i <= N);
		// calculate result//
		result = p - s1 + s2;
		// print result//
		System.out.printf("S = %1.4f ", result);
	}
}
