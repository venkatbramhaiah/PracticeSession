package StringLogical;

public class RevEachWord {
	String revs(String str){
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s+=str.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {

		String str="Yarramneedi Venakt Naveen";
		String words[]=str.split("\\s");
		
		RevEachWord obj=new RevEachWord();
		
		// without using default methods=====
		String revWords="";
		for(String wrd:words){
			
		}
		
		// with the help of StringBuffer======
		for(String wrd:words){	
		     System.out.println(obj.revs(wrd));
			
			StringBuffer sb=new StringBuffer(wrd);
			
			revWords+=sb.reverse()+" ";
		}
		System.out.println(revWords);
	}

}
