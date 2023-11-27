package edu.training.lesson8.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов.

		int[][] matrix = new int[5][5];
		int sum = 0;
		Random rand = new Random();

		System.out.println("Исходная матрица:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(21) - 10;

				System.out.printf("[%2d]", matrix[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0 && (matrix[i][j] % 2) != 0) {
					sum += matrix[i][j];
				}
			}
		}
		System.out.println("Сумма отрицательных нечетных элементов: " + sum);
		System.out.println("Сумма модулей отрицательных нечетных элементов: " + Math.abs(sum));
	}
}
