package ExceptionHandling;

class CustomException extends Exception {
	public CustomException(String str) {
		super(str);
	}
}

public class ThrowExapmle {

	static void Employee(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException(" Not allowed to Vote ===");
		} else {
			System.out.println("Allowed to Vote====");
		}
	}

	public static void main(String[] args) {
		try {
			Employee(14);
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

}
