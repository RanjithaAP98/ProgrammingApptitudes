package com.xworkz.twodiamentionalarray;

public class SumOfPrimaryDiagonals {

	public static void main(String[] args) {
		
		int[][] array = { {1, 2, 3}, 
						{4, 1, 6}, 
						{7, 8, 1} };
		
		int primarySum=0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
				if(i==j) {
					 primarySum= primarySum + array[i][j];
				}
			}
		}
		System.out.println("Sum of primary diagonals = " +  primarySum);
	}
}
