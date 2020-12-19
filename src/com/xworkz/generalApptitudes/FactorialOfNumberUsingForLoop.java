package com.xworkz.generalApptitudes;

import java.util.Scanner;

public class FactorialOfNumberUsingForLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		
		int i,fact=1;
		for(i=1; i<=number;i++) {
			fact=fact*i;
		}
		 System.out.println("Factorial of " + number + "is :" +fact);
	}

}
