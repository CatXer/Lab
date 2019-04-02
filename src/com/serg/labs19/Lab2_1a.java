package com.serg.labs19;

import java.util.Scanner;

public class Lab2_1a {

	public static void main(String[] args) {
		// initial//
		Scanner inp = new Scanner(System.in);
		System.out.print("¬ведите a : ");
		double a = inp.nextDouble();
		inp.close();
		double y = 0;
		// check statements - if//
		if (a == 0 || a >= 100)
			y = a - 12;
		else if (a >= 10 && a < 18 || a == 50)
			y = a * a - a;
		else if (a >= 1 && a <= 4 || a == 7)
			y = Math.pow(2, a) + 1;
		else
			y = 2 / a;
		// print answer//
		System.out.printf("y = %1.4f ", y);
	}

}
