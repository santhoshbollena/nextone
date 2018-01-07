
public class Varargs {
	public static void main(String args[])
	{
		double d=0_123.5_6;
		System.out.println(d);
		method(1,2);
	}
	static void method(int k,int ...i)
	{
		System.out.println(i+"with varargs");
	}
	static void method(int k,int i)
	{
		System.out.println(i+"no varargs");
	}
	
}
