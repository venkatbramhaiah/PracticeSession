package StringPracise;

 final class Employee{
	 final String panNum;
	 
	  public String getPanNum() {
		return panNum;
	}

	Employee(String pan){
		  this.panNum=pan;
	  }
	  
	  
	 
 }
public class ImmutableClass {

	public static void main(String[] args) {
		Employee obj=new Employee("AMJPY1993");
		String str=obj.getPanNum();
		System.out.println(str);
	}

}
