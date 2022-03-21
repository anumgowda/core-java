package interview;
public class autoboxing {
	public static void main(String [] args) {
	String sentance="hello hi welcome";
	System.out.println(sentance);
	int i=10;
	Integer i1=i;
	System.out.println(i1.toString());   //auto boxing
	System.out.println(i1.hashCode());
	double d=2.3;
	Double d1=d;
	System.out.println(d1.toString());
	System.out.println(d1.hashCode());
	char c='G';
	Character ch=c;
	System.out.println(ch.toString());
	System.out.println(ch.hashCode());
	float f=23456;
	Float f1=f;
	System.out.println(f1.toString());
	System.out.println(f1.hashCode());        //we can't use Object methods to premitive data types,so we converting premitive to object type
	short s=23;                                 
	Short s1=s;
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	byte  b=2;
	Byte b1=b;
	System.out.println(b1.toString());
	System.out.println(b1.hashCode());
	boolean boo=true;
	Boolean boo1=boo;
	System.out.println(boo1.toString());
	System.out.println(boo1.hashCode());
	long l=345678990;
	Long l1=l;
	System.out.println(l1.toString());
	System.out.println(l1.hashCode());
	
	
	
	
	
	//Unboxing
	Integer inter=10;
	int int1=inter.intValue();     //unboxing
	System.out.println(int1);
	
	Character ch1='a';
	char ch2=ch1.charValue();
	System.out.println(ch1);
	
	Byte b11=12;
	byte b2=b11;                    //Auto unboxing
	System.out.println(b11);
	
	
	
	
	
	
	
	
	
	
	
	
	  }
}
