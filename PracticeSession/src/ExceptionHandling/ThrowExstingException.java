package ExceptionHandling;

public class ThrowExstingException {

	static int Add(int num1, int num2){
		if(num1 == 0)
			throw new ArithmeticException("First num can't be zero====");
		else
		return num1+num2;
	}
	public static void main(String[] args) {
		try{
		int res=Add(23,12);
		System.out.println(res);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
