package com.serg.labs19;

import java.util.Scanner;

public class Lab8_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String startStr, word = "";
		StringBuilder result = new StringBuilder();
		int k, pos = 0;
		System.out.println("Enter any stroke ->");
		startStr = in.nextLine() + " ";
		System.out.print("Enter [K] position to revert [K] word:");
		k = Math.abs(in.nextInt());
		in.close();
		for (int i = 0; i < startStr.length(); i++) {
			char c = startStr.charAt(i);
			// 65 - 122 A-z
			// 1040 - 1103 А-я
			// 48 - 57 0 - 9

			// if (("" + c).matches(".*[\\w\\p{InCyrillic}].*")) {
			if (65 <= c && c <= 122 || 1040 <= c && c <= 1103 || 48 <= c && c <= 57) {
				word += c;
			} else if (word.length() > 0) {
				if (++pos == k) {
					pos = 0;
					for (int j = word.length() - 1; j >= 0; j--)
						result.append(word.charAt(j));
				} else
					result.append(word);
				word = "";
				result.append(c);
			} else
				result.append(c);
		}
		System.out.println("New stroke:\n" + result);
	}
}
