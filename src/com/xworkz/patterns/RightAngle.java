package com.xworkz.patterns;

public class RightAngle {
	
	public static void main(String[] args) {
		
		int num = 4;
		
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}	
	}
}

//Output:
//	
//	*
//	**
//	***
//	****
//	*****
	
