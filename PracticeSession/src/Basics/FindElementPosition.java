package Basics;

import java.util.Scanner;

public class FindElementPosition {
public static void main(String[] args) {
	int arr[]={23,24,25,26,27,28};
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number to search ");
	int num=sc.nextInt();
	   for(int i=0;i<arr.length;i++){
		   if(num == arr[i]){
			   System.out.println(num+ " find in " +(i+1)+" position ");
		   }
	   }
}
}
