package ArrayLogic;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int arr[]={1,2,3,4,5,6};
		int arr1[]={1,2,4,5,6,3};
		System.out.println(Arrays.equals(arr, arr1));
		
		
		// another way of comparing 
		int count=0;
		int a=arr.length;
		int b=arr1.length;
		if(a == b){
			for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
					if(i==j && arr[i] == arr1[j] ){
						count++;
					}else{
						continue;
					}
				}
			}
			
			if(count == a){
				System.out.println("Both are same");
			}
			else System.out.println("===========Both are not same");
		}else
			System.out.println("Both are not same==========");
	}

}
