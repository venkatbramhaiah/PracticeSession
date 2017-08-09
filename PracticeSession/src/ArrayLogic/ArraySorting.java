package ArrayLogic;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 67,8, 43, 21, 33, 9, 0 };
// Sorting an array using predefined method ==========
		Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));

		// Sorting an array without using predefined method =====
		int temp;
	for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] < arr[j]) 
// if we use ">" then the output will be in Ascending order "<" for descending order======
				{
				temp = arr[i];
					arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		// sorting an array without using temp variable =======
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
