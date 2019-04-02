package com.serg.labs19;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7_3 {
	public static void main(String[] args) {
		// initial//
		Scanner in = new Scanner(System.in);
		double[][] matrix;
		int n;
		double sumEven = 0;
		// input//
		System.out.print("������� ����� ����� � �������� [n] ��� ������� [n x n]:");
		n = in.nextInt();
		if (n == 0) {
			System.out.println("������: ������ �������");
			in.close();
			System.exit(1);
		}
		// ���� �������//
		matrix = new double[n][n];

		for (int row = 0; row < n; row++)
			for (int m = 0; m < n; m++) {
				System.out.print("������� X[" + (row + 1) + "," + (m + 1) + "]= ");
				matrix[row][m] = in.nextDouble();
				if (row % 2 != 0 && m % 2 != 0)
					sumEven += matrix[row][m];
			}
		in.close();
		// ����� ������� //����� ������ ������������ ��������� �����// //
		System.out.println("�� ����� ��������� ������� :");
		for (int row = 0; row < n; row++) {
			System.out.print("| ");
			for (double el : matrix[row])
				System.out.printf("%10.6f  ", el);
			System.out.println(" |");
		}
		System.out.println("����� ������� :");
		// replacing upper triangle elements on sum//
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				if (j > i)
					matrix[i][j] = sumEven;
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
