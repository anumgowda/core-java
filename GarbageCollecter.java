
public class GarbageCollecter {
	@Override
	
	protected void finalize()
	{
		System.out.println("garbage collecter in action deleted one object");
		
	}
	String name;
	GarbageCollecter(String name)
	{
		this.name=name;
	}
public static void main(String [] args) {
	GarbageCollecter gc1=new GarbageCollecter("abc");
	GarbageCollecter  gc2=new GarbageCollecter("xyz");
	gc1.name=gc2.name;
	gc1=null;
	gc2=null;
      System.gc();
}
}