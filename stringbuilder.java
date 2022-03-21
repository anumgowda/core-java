package interview;

public class stringbuilder {
	public static void main(String[] args) {
		String str="anu";
		System.out.println(str.hashCode());                 
		str=str + "sha";
		System.out.println(str.toUpperCase());
		
		System.out.println(str.charAt(1));
		System.out.println(str.hashCode());
		StringBuilder builder=new StringBuilder("anu");
		System.out.println(builder.hashCode());
		builder=builder.append("sha");
		System.out.println(builder.hashCode());
		char ch[]=str.toCharArray();
				for(int y=ch.length-1;y>=0;y--)
				{
					System.out.print(ch[y]);
				}
	}

}
