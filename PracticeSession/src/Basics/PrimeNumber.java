package Basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbe to check the prime number or not ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is prime numer ");
		} else {
			System.out.println(num + " is not a prime number ");
		}

		System.out.println("============== DISPLAY PRIME NUMBERS ==============");

		
		
		
		System.out.println("Enter the number to get all prime numbers before that ");
		int prime = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i < prime; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
			}
			cnt = 0;
		}
	}

}
