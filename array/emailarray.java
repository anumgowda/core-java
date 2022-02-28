class Emailid{
public static void main(String [] arg){
String [] emails={"anu@gmail.com","saru@gmail.com","pooja@gmail.com","deepti@gmail.com"};
System.out.println(emails[0]);
System.out.println(emails[3]);
emails[3]="deepthi@gmail.com";
emails[0]="anugowda@gmail.com";//changing the value
System.out.println(emails[0]);
System.out.println(emails[3]);
System.out.println(emails.length);//length of array
}
}