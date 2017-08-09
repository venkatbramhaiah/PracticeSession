package Basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse ");
		int num = sc.nextInt();
		temp = num;
		while (num != 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the " + temp + " is " + rev);
	}

}
