package com.xworkz.twodiamentionalarray;

public class SumOfDiagonals {
	
	public static void main(String[] args) {
		
	int[][] array = { {1, 2, 2}, 
					{4, 1, 6}, 
					{2, 8, 1} };
		
		int n=3;	
		int primarySum=0;
		int secondarySum=0;
		
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			
			if(i==j)
				 primarySum= primarySum + array[i][j];
			
			if((i+j) == (n-1)) 
				secondarySum =secondarySum+array[i][j];
		   }
		}
		
		System.out.println("Sum of primary diagonals = " +  primarySum);
		System.out.println("Sum of secondary diagonals = " + secondarySum);
		
	}
}
