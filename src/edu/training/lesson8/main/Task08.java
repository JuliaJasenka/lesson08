package edu.training.lesson8.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива.

		int size = 5;
		int number = 7;
		int[][] matrix = new int[size][size];
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(10);
				System.out.printf("[%3d]", matrix[i][j]);
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					count += 1;
				}
			}
		}
		System.out.println("Число вхождений числа " + number + " в массив составляет " + count);
	}

}
