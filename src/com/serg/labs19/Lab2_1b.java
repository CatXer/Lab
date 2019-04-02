package com.serg.labs19;

import java.util.Scanner;

public class Lab2_1b {

	public static void main(String... args) {
		// initial & input//
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите a: ");
		double y = 0, a = in.nextDouble();
		in.close();
		// check statement - switch(case)//
		switch ((a == 0 || a >= 100) ? 0 : 1) {
		case 0:
			y = a - 12;
			break;
		case 1:
			switch ((a == 50 || a >= 10 && a < 18) ? 0 : 1) {
			case 0:
				y = a * a - a;
				break;
			case 1:
				switch ((a == 7 || a >= 1 && a <= 4) ? 0 : 1) {
				case 0:
					y = Math.pow(2, a) + 1;
					break;
				case 1:
					y = 2 / a;
				}
			}
		}
		// print result//
		System.out.printf("y = %1.4f", y);
	}
}
