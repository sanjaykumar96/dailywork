package com.cts.feb26;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j, row, col, sum = 0;
		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("The elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("");
		}
		rowsum(mat, row, col);
		colsum(mat, row, col);
		System.out.println("\n sum of diagonal element of metrix: " + dioagonalsum(mat, row, col));
		sum(mat, row, col);
	}

	private static void sum(int[][] mat, int row, int col) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		for (i = 0; i < col; i++) {

			for (j = 0; j < row; j++) {
				if ((mat[i][j] % 2 == 0) && (mat[i][j] % 3 == 0))
					sum = sum + mat[i][j];

			}

		}
		System.out.println("sum of element divisible byn 2 and 3=" + sum);
	}

	private static void colsum(int[][] mat, int row, int col) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0; i < col; i++) {
			int r = 0;
			for (j = 0; j < row; j++) {
				r = r + mat[i][j];
			}
			System.out.println("sum of col" + i + "=" + r);
		}

	}

	private static void rowsum(int[][] mat, int row, int col) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0; i < row; i++) {
			int r = 0;
			for (j = 0; j < col; j++) {
				r = r + mat[i][j];
			}
			System.out.println("sum of row" + i + "=" + r);
		}
	}

	private static int dioagonalsum(int[][] mat, int row, int col) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (i == j) {
					sum = sum + mat[i][j];
				}
			}
		}
		return sum;
	}
}
