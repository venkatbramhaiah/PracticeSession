package Basics;

public class NonArgConstructor {
	private int num;

	/* ====== NO argument constructor ===== */
	NonArgConstructor() {
		System.out.println("=======NonArgConstructor=======");
	}
	
//	int display(int n){
//		num=n;
//		return num;
//	}

	/*
	  ======== Default constructor ======
	  NonArgConstructor(){}
	 */
	/* ==== Perameterized Constructor === */
//	NonArgConstructor(int num, String name) {
//		System.out.println("===========Perameterized Constructor===========");
//	}

	public static void main(String[] args) {
		NonArgConstructor obj = new NonArgConstructor();
		//NonArgConstructor obj1 = new NonArgConstructor(3, "Venkt");
		//System.out.println("  "+obj.display(9));
	}

}


/*   class Example{
	 private int num;
	 public  Example(int var){
		 num=var;
	 }
	  int diplay(){
		  return num;
	  }
	  
	  public static void main(String[] args) {
		  Example obj=new Example();
	}
    }  
    
*/