package OopsConcepts;

public class SingletonClass {
	private static SingletonClass obj = null;

	private SingletonClass() {
		
	}

	public static SingletonClass objectCreation() {
		if (obj == null) {
			obj = new SingletonClass();
		}
		System.out.println("============");
		return obj;
	}

	void display() {
		System.out.println("Sigleton class example=====");
	}

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.objectCreation();
		obj.display();
	}
}
