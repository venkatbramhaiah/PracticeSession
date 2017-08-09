package StringPracise;

public class ImmutableExample {
public static void main(String[] args) {
	String s="Venkat";
	System.out.println("Before contcat ======="+s);
	s.concat(" Naveen");
	System.out.println("After concat ========="+s);
	
// Once assigned reference to any object then only we can able to see the concated Stting.
	s=s.concat("Naveen Yarramneedi");
	System.out.println("After assign instances ======="+s);
}
}
