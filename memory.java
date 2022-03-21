package interview;

public class memory {
	public static void main(String[] args) {
		//String literals
		String name="anu";
		String name1="anu";
		String st=new String("anu");
		
		  String st1 = "anuu";
		  st1="anu";
		  String str="Anu";
		System.out.println(st1.equalsIgnoreCase(str));
		System.out.println(st==st1);
		System.out.println(st==str);
		System.out.println(st1==str);
		String name11="null";
		String name2=null;//when object is null we cannot access with any methods so o/p will be null pointer exception
		System.out.println(name2.equalsIgnoreCase(name11));//null pointer exception
		System.out.println(name11.equalsIgnoreCase(name2));//false
		
	}

}
