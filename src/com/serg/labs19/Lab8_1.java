package com.serg.labs19;

import java.util.Scanner;

public class Lab8_1 {
	public static void main(String[] args) {
		// инициализация //
		Scanner in = new Scanner(System.in);
		String newString;
		char[] s;
		// ввод //
		System.out.println("Введите строку :");
		s = in.nextLine().toCharArray();
		in.close();
		// Каждый 5-й символ заменить на символ «F». //
		for (int i = 4; i < s.length; i+=5)
				s[i] = 'F';
		// строка из миссива //
		newString = new String(s);
		// вывод строки //
		System.out.println("Новая строка :\n" + newString);

	}
}
