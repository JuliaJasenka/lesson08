package edu.training.lesson8.main;

import java.util.Random;

public class Task04 {
	public static void main(String[] args) {
			
			int[][] mas = new int[3][4];
			
			init(mas);
			print(mas);
			
					
			System.out.println("Выводим первую строку.");
			for(int j = 0; j < mas[0].length; j++) {
				System.out.print(mas[0][j] + " ");
			}
			
			System.out.println("\nВыводим последнюю строку.");
			for(int j = 0; j < mas[mas.length - 1].length; j++) {
				System.out.print(mas[mas.length - 1][j] + " ");
			}
			
			System.out.println("\nВыводим первый столбец.");
			for(int i = 0; i < mas.length; i++) {
				System.out.println(mas[i][0] + " ");
			}
			
			System.out.println("\nВыводим последний столбец.");
			for(int i = 0; i < mas.length; i++) {
				System.out.println(mas[i][mas[i].length-1] + " ");
			}
			
		}
	//////////////////////////////////////////////////////////
		public static void init(int[][] ar) {
			Random rand = new Random();
			
			for(int i=0; i<ar.length; i++) {					
				for(int j=0; j<ar[i].length; j++) {
					//System.out.print(i + " " + j + " | ");
					ar[i][j] = rand.nextInt(100);
				}			
				//System.out.println();			
			}		
		}
	////////////////////////////////////////////////////////////
		public static void print(int[][] mas) {
			for(int i=0; i<mas.length; i++) {
				for(int j=0; j<mas[i].length; j++) {
					System.out.printf("%3d ", mas[i][j]);
				}
				System.out.println();
			}
////////////////////////////////////////////////////////////			
			
		

	}
	
	
}