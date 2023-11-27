package edu.training.lesson8.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

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
		System.out.println("Четные строки исходной матрицы:");

	for (int i = 0; i < matrix.length; i = i + 2) {
		System.out.printf("{%1d} - ", i);
		for (int j = 0; j < matrix[i].length; j++) {
		System.out.printf("[%2d]", matrix[i][j]);
		}
		System.out.println();
		}
	
	}
}
