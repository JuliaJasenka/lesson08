package edu.training.lesson8.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];

	}

	public static void init(int[][] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt();
			}
		}
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
	}
	}
	
}
