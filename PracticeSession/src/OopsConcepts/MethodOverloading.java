package OopsConcepts;

class Overload {

	final int dispaly1(int num) {
		return num;
	}

	int display(int num1, int num2) {
		return num1 * num2;
	}
	final int dispaly1(int num,int num1) {
		return num;
	}
	

}

public class MethodOverloading {
	

	public static void main(String[] args) {
		Overload obj = new Overload();
		int x = obj.dispaly1(5);
		System.out.println("======" + x);
		int mul = obj.display(4, 5);
		System.out.println("Mul====" + mul);

	}

}
