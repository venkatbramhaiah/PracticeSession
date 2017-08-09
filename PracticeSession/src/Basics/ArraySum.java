package Basics;

public class ArraySum {

	public static void main(String[] args) {

		int arr[]={23,24,25,26,27};
		int sum=0;
		for(int num:arr){
			sum=sum+num;
		}
		System.out.println("Sum of the array elements is "+sum);
		
		System.out.println("================= Second way output =================");
		int tot=0;
		for(int i=0; i<arr.length;i++){
		 tot=tot+arr[i];
		}
		System.out.println("Sum of the array elements is "+tot);
	}

}
