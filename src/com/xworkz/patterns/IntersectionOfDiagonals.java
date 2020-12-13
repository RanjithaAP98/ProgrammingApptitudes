package com.xworkz.patterns;

public class IntersectionOfDiagonals {

	public static void main(String[] args) {
		
		int num = 6;
		
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				
				if(i==j || i+j==num)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();
		}	
	}

}
//output:
//	
//	*     *
//	 *   * 
//	  * *  
//	   *   
//	  * *  
//	 *   * 
//	*     *

	
		

	
