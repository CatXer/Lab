package com.serg.labs19;

import java.util.Scanner;

public class Lab3_1a {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int M, N;
		double a, result, p = 1, s1 = 0, s2 = 0;
		// input//
		System.out.print("¬ведите предел -> M = ");
		M = in.nextInt();
		System.out.print("¬ведите предел -> N = ");
		N = in.nextInt();
		System.out.print("¬ведите параметр -> a = ");
		a = in.nextDouble();
		in.close();
		// use <for operator> for calculate p & s1 & s2//
		for (int k = 0; k <= M; k++) {
			p *= 2 * k / (a + M - 1);
			s2 += k + 3 - N;
		}
		for (int j = 1; j <= N; j++)
			s1 += j * j - 1;
		// calculate result//
		result = p - s1 + s2;
		// print result//
		System.out.printf("S = %1.4f", result);
	}
}
