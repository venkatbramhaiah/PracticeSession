package StringPracise;

public class AllStringClassMethods {

	public static void main(String[] args) {

		String str1="Venkat ";
		String str2="Naveen ";
		String str3="Yarramneedi";

// UpperCase and LowerCase methods. 
		System.out.println("Upper Case == "+str1.toUpperCase()+" Lower Case == "+str1.toLowerCase());
// Trim method used to remove the unwanted spaces before and after the String.
		System.out.println("Before Trim == "+str1+" After Trim == "+str1.trim());
// Starts with and ends with it will return wither false or true.
		System.out.println("Starts with == "+str1.startsWith("Ve")+" Ends with == "+str3.endsWith("i"));
// Using charAt() it is used to get the character based on the index value.
		System.out.println("Character in the position of == "+str1.charAt(4));
// Using Length() used to get the length of the String.
		System.out.println("The length of str1= "+str1.trim().length()+" str2= "+str2.trim().length()+" Str3= "+str3.length());
		
	}

}
