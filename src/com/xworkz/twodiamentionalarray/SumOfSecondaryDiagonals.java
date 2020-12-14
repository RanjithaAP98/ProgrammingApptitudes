package com.xworkz.twodiamentionalarray;

public class SumOfSecondaryDiagonals {
	
	public static void main(String[] args) {
		
		int[][] array = { {7, 2, 1}, {4, 1, 6}, {1, 8, 9} };
		
		int n=3;
		int secondarySum=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if((i+j) == (n-1)) 
					secondarySum =secondarySum+array[i][j];
			}
		}
		System.out.println("Sum of secondary diagonals = " + secondarySum);
	}

}
