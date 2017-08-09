package StringPracise;

public class StringBufferExample {

	public static void main(String[] args) {

		String str1="Venkat ";
		String str2="Naveen ";
		String str3="Yarramneedi";
		StringBuffer str;
// append() method is used to add the string at the end......		
		str= new StringBuffer().append(str1).append(str2);
		System.out.println(str);
// insert() method is used to insert the value based on the index value.....
		str=new StringBuffer(str1).append(str2).insert(str.length(), str3);
		System.out.println(str);
// replace() method used to replace the string based on the staring and ending index value....
		str=new StringBuffer(str1).replace(str1.length()-1,str1.length(),str2).append(str3);
		System.out.println(str);
// delete() method which is used to delete the char based on the index value.. 
		str=new StringBuffer(str1).delete(6, 7).append(str2);
		System.out.println(str);
// eeveres() method used to reverese the string...
		str=new StringBuffer(str1.trim()).reverse();
		System.out.println(str);
	}

}
