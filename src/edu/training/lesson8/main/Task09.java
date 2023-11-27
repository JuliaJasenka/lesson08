package edu.training.lesson8.main;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int size = 6;
		int[][] matrix = new int[size][size];
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(99);
				System.out.printf("[%3d]", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
			}
			System.out.printf("[%3d]", matrix[i][i]);
		}
		System.out.println("");
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = 0; j < matrix[i].length; j++) {
			}
			System.out.printf("[%3d]", matrix[i][i]);
		}

	}
}
