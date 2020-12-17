package com.xworkz.generalApptitudes;

import java.util.Scanner;

public class PrimeNumberUsingRecursive {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number ");

		int number = scanner.nextInt();
		System.out.println(number);

		boolean prime = false;
		if (number > 1) {
			prime = primeNumber(number, 2);
			if (prime == false) {
				System.out.println("Number not prime");
			} else {
				System.out.println("Number is prime");
			}
		}
		else
			System.out.println("please add number that is graterthen 1");
	}

	static boolean primeNumber(int number, int i) {
		if (number > i) {
			if (number % i == 0) {
				return false;
			} else {
				return primeNumber(number, ++i);
			}
		}
		return true;
	}
}