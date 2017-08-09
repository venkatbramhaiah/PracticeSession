package StringLogical;

import java.util.HashMap;

public class StrinLogic {

	public static void main(String[] args) {
		String str = "Yarramneedi Venkat Naveen";

		// Login to find the number of occurrences of the given Character.
		int count = str.length() - str.replace("a", "").length();
		System.out.println(count);

		// Logic to find the number of occurrences of the each Character.
		String str1 = "sriram";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char strArray[] = str1.toCharArray();
		for (char ch : strArray) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

		// Remove all white spaces from String======
		String words[] = str.split("\\s");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]);
		}
	}
}
