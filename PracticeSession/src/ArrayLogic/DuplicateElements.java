package ArrayLogic;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[]={1,13,24,35,65,43,54,35,13};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]  && i!=j){
					System.out.println(arr[i]);
				}
			}
		}
	}
}
