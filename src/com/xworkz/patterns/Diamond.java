package com.xworkz.patterns;

public class Diamond {
	
	public static void main(String[] args) {
	

		int num = 4;
		
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				
				if(j-i == num/2 || i==num/2 || i+j==num/2 || j==num/2 || i+j==num+num/2 || i-j== num/2)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();
		}	
	}
}

//Output:

//			*  
//		   *** 
//		  *****
//		   *** 
//			*  

