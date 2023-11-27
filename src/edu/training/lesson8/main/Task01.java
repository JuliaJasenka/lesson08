package edu.training.lesson8.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
		// была ровно одна единица, и вывести на экран.

		int[][] array = new int[3][4];
		Random rn = new Random();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				//int randomIndex = rn.nextInt(4);
			int randomIndex = (int) (Math.random()*4);

				array[i][randomIndex] = 1;
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
