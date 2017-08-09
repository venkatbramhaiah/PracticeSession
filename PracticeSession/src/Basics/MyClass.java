package Basics;

 class Parent{
	void display(){
		System.out.println(" Please use this session carefully");
	}
}
public class MyClass {
     void message(){
    	System.out.println(" Welcome to Java deeper session");
    }
	public static void main(String[] args) {
      MyClass obj=new MyClass();
      Parent obj1=new Parent();
      obj.message();
      obj1.display();
	}

}
