package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		int zero_count = 0, length, j = 0;
		double[] Xk, Zm;

		// ����//
		System.out.print("������� ������ �������: ");
		length = Math.abs(in.nextInt());
		Zm = new double[length];
		System.out.println("�������� ������ �� " + length + " ���������:");

		for (int i = 0; i < length; i++) {
			System.out.print("������� X" + (i + 1) + ":");
			Zm[i] = in.nextDouble();
			if (Zm[i] == 0)
				zero_count++;
		}

		System.out.println("�� ����� ������: " + Arrays.toString(Zm));
		in.close();

		// ���������� ������� Xk//
		Xk = new double[length - zero_count];

		for (int i = 0; j < Xk.length && i < Zm.length; i += 2) {
			double x = Zm[i];
			if (x == 0)
				continue;
			Xk[j++] = x;
		}
		for (int i = 1; j < Xk.length && i < Zm.length; i += 2) {
			double x = Zm[i];
			if (x == 0)
				continue;
			Xk[j++] = x;
		}

		// ���������� �����//
		for (int gap = Zm.length / 2; gap > 0; gap /= 2) {
			// Do a gaped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already in gaped order
			// keep adding one more element until the entire array is
			// gap sorted
			for (int i = gap; i < Zm.length; i++) {
				// add a[i] to the elements that have been gap sorted
				// save a[i] in temp and make a hole at position i
				double temp = Zm[i];
				// shift earlier gap-sorted elements up until the correct
				// location for a[i] is found
				for (j = i; j >= gap && Zm[j - gap] < temp; j -= gap)
					Zm[j] = Zm[j - gap];
				// put temp (the original a[i]) in its correct location
				Zm[j] = temp;
			}
		}

		// ����� �����������//

		System.out.println(
				"��� ������� ����� ������ ������� �� ������, � ����� �������� ��������: \n" + Arrays.toString(Xk));
		System.out.println("������ ������ ��� ������������ �� ��������: \n" + Arrays.toString(Zm));
	}
}
