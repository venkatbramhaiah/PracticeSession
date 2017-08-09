package OopsConcepts;

import java.io.IOException;

import com.google.appengine.api.appidentity.AppIdentityServicePb.SigningService.Method;
import com.google.appengine.api.datastore.Query.GeoRegion.Circle;

class ParentExcep {
	public ParentExcep display() throws NullPointerException {
		
		System.out.println("Parent Calss don't thorough any exception=========");
		return null;
	}

//	 void display(){
//	 System.out.println("Parent Calss don't thorough any exception=========");
//	 }
}

public class MethodOverException extends ParentExcep {

	
	  public MethodOverException display() {
	// System.out.println("Child class throws Unchedked Exceptions==============" );
		  return null;
	  }
	 

//	void display()  {
//
//		System.out.println("Child class throws Unchedked Exceptions==============");
//	}

	public static void main(String[] args) {
		ParentExcep obj = new MethodOverException();
		try {
			obj.display();
		} catch (Exception e) {
			System.out.println("=====" + e);
		}
	}

}
