package StringLogical;

 class Reve{
    static String rev(String str){
    	String rev="";
    	char  ch[]=str.toCharArray();
    	for(int i=ch.length-1;i>=0;i--){
    		rev+=ch[i];
    	}
    	return rev;
    }
}

public class StringReverese {
 	public static void main(String[] args) {
String str3="srikanth";
String str1=new String("srikanth");

System.out.println(System.identityHashCode(str3)+"   "+System.identityHashCode(str1));
		String str="Yarramneedi";
	// using StiringBuffer==========	
		StringBuffer sb=new StringBuffer(str).reverse();
		System.out.println(sb);
		
	// with out using predefined methods====
		for(int i=str.length()-1; i>=0;i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
			
	// Using predefined method=======
			String str2=Reve.rev("Yarramneedi");
			System.out.println(str2);
	}

}
