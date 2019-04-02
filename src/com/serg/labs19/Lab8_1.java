package com.serg.labs19;

import java.util.Scanner;

public class Lab8_1 {
	public static void main(String[] args) {
		// init//
		Scanner in = new Scanner(System.in);
		String newString;
		char[] s;
		// input//
		System.out.println("Input any stroke:");
		s = in.nextLine().toCharArray();
		in.close();
		// replace every five`s character to `F`//
		for (int i = 0; i < s.length; i++)
			if ((i + 1) % 5 == 0)
				s[i] = 'F';
		// convert char array to string//
		newString = new String(s);
		// print new string//
		System.out.println("Refactored stroke is:\n" + newString);

	}
}
