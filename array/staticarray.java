class Student 
{
static  int[] number={2,4,5,8,0,9,3};
public static void main(String []arg){
System.out.println(arg[0]);
System.out.println(number[0]);
number[0]=234;       //changing the value
System.out.println(number[0]);
System.out.println(arg[0]);
}
}