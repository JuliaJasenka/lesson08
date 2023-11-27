package edu.training.lesson8.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
		// [0, 9].

		int[][] array = new int[2][3];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.printf("[%d]", array[i][j]);
			}
			System.out.println();
		}
	}
}
