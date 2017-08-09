package StringPracise;

public class SubStringExample {

	public static void main(String[] args) {

		String str = "Yarramneedi Venkat Naveen";
		String s1 = str.substring(12);// Starting index for SubString;
		System.out.println("First name ====== " + s1);
		String s2 = str.substring(0, 11);// Starting index and ending index for SubString;
		System.out.println("Sur name ===== " + s2);
	}

}
