package OopsConcepts;

class MethodOverriding extends Parent {
	void disp() {
		System.out.println("Child class method=======");
	}

	public int res(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.disp();
		int mul = obj.res(4, 6);
		System.out.println(mul);

	}
}
