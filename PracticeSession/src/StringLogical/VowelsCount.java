package StringLogical;

import java.util.HashMap;

public class VowelsCount {
	String str = "yarramneedi venakt naveen";

	public int counter() {
		int count = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch) + 1);
				} else {
					hm.put(ch, 1);
				}
				count++;
			}
		}
		System.out.println(hm);
		return count;
	}

	public static void main(String[] args) {
		VowelsCount obj = new VowelsCount();
	     System.out.println(obj.counter());
	}

}
