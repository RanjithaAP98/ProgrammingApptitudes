package com.xworkz.generalApptitudes;

public class PrimeNumberUsingWhileLoop {
	
	public static void main(String[] args) {
		
		int i = 2;
		int number = 13;
		int count = 0;
		
		while(i < number) {
			if(number % i == 0) {
				count++;
			break;
		}
		i++;
		}
		
		if(count==0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
			
	}
}