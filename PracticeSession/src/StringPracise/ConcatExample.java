package StringPracise;

public class ConcatExample {

	// Concatenation of the String will be possible in two ways

	public static void main(String[] args) {
		String s1 = "Venkat";
		String s2 = " Naveen";
		String s3 = " Yarramneedi";

		String str = s1 + s2;

		String str1 = str.concat(s3);

		System.out.println("First name ===== " + str);
		System.out.println("Full name ===== " + str1);

	}

}
