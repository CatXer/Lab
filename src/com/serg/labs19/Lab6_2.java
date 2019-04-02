package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		// �������������//
		Scanner in = new Scanner(System.in);
		int countOdd = 0, newL = 0, length = 0;
		double Yn[], rangeDown, rangeUp, Mid = 0;
		// ����//
		System.out.print("������� ������ �������: ");
		length = Math.abs(in.nextInt());
		if (length == 0) {
			System.out.println("������: �� ����� ������� ������.");
			in.close();
			return;
		}
		Yn = new double[length];
		System.out.println("�������� ������ �� " + length + " ���������:");
		for (int i = 0; i < length; i++) {
			System.out.print("������� X" + (i + 1) + ":");
			Yn[i] = in.nextDouble();
			if (Yn[i] % 2 != 0) {
				Mid += Yn[i];
				countOdd++;
			}
		}
		Mid /= countOdd;
		System.out.print("������� ������� ������� ���������: ");
		rangeDown = in.nextDouble();
		System.out.print("������� ������� ������� ���������: ");
		rangeUp = in.nextDouble();
		if (rangeUp < rangeDown) {
			rangeUp += rangeDown;
			rangeDown = rangeUp - rangeDown;
			rangeUp -= rangeDown;
		}
		System.out.println("�� ����� ������: " + Arrays.toString(Yn) + ";\n�� ����� ��������: [" + rangeDown + ":"
				+ rangeUp + "];");

		in.close();
		System.out.println("������� �������������� �������� ��������� = " + Mid);
		// �������� ��������� � ������� ������//
		int j = 0;
		for (int i = 0; i < Yn.length; i++) {
			double n = Yn[i];
			if (n % 1 != 0)
				continue;
			newL++;
			Yn[j++] = n >= rangeDown && n <= rangeUp ? Mid : n;
		}
		// ����� ������//
		System.out.println("� ���������� ���� ������� [" + (Yn.length - newL)
				+ "] ��������� � ������� ������ � ������ ������ ���:");
		System.out.print(Arrays.toString(Yn));
	}
}
