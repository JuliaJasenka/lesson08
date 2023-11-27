package edu.training.lesson8.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
		// больше последнего.

		int[][] matrix = new int[4][4];
		Random rand = new Random();

		System.out.println("Исходная матрица:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(10);
				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Нечетные столбцы, у которых первый элемент больше последнего:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[0][j] > matrix[matrix.length - 1][j]) {
					System.out.printf("[%2d]", matrix[i][j]);
				} else {
					System.out.printf("    ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
