package StringPracise;

public class ExampletoString {
	int roolnum;
	String name, add;
	 
	ExampletoString(int num, String name, String add){
	     this.roolnum=num;
		this.name=name;
		this.add=add;
	}
	
	public String toString(){
		return roolnum+" "+name+" "+add;
	}

	public static void main(String[] args) {
		ExampletoString obj= new ExampletoString(121, "Venakt", "Chennai");
		System.out.println(obj);
		System.out.println(obj.toString());
		

	}

}
