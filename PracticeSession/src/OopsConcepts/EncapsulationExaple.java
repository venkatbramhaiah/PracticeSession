package OopsConcepts;
  class Outside{
	 private String name;
	 private int age;
	 private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public int getAge(){
		 return age;
	 }
	 public void setAge(int age){
		 this.age=age;
	 }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
 }

public class EncapsulationExaple {

	public static void main(String[] args) {
		Outside obj=new Outside();
		obj.setName("Venkat");
		obj.setAge(24);
		obj.setAddress("Chennai");
		
		System.out.println("Age of the "+obj.getName()+" is "+obj.getAge()+" staying in "+obj.getAddress());

	}

}
