package Basics;

public class GenerateRandomNumbers {

	public static void main(String[] args) {

		for(int i=0; i<5;i++){
			System.out.println(Math.round((Math.random()*50+1)));
		}
	}

}
