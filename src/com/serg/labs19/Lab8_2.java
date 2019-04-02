package com.serg.labs19;

import java.util.Scanner;

public class Lab8_2 {
	public static void main(String[] args) {
		// init//
		Scanner in = new Scanner(System.in);
		String[] words;
		String result = "";
		int k;
		// input//
		System.out.println("Enter any stroke:");
		words = in.nextLine().split(" ");
		System.out.println("Enter [K] position to revert [K] word:");
		k = Math.abs(in.nextInt());
		in.close();
		// refactor stroke//
		boolean revert = false;
		for (int i = 0; i < words.length; i++) {
			if (!revert && (i + 1) % k == 0)
				revert = true;
			if (revert && words[i].matches(".*[\\w\\p{InCyrillic}].*")) {
				String reverse = "";
				for (int j = words[i].length() - 1; j >= 0; j--)
					reverse += words[i].charAt(j);
				words[i] = reverse;
				revert = false;
			}
			result += " " + words[i];
		}
		// print result//
		System.out.println("New stroke:\n" + result);
	}
}
