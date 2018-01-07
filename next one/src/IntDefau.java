interface ifn
{
	default void method()
	{
		System.out.println("default meth in inf");
	}
}
class Demow implements ifn
{
	public void method()
	{
		ifn.super.method();
		System.out.println("meth in class");
	}
	public void method( int a)
	{
		ifn.super.method();
		
	}
}
public class IntDefau {
	
	public static void main(String args[])
	{
		
		Demow o=new Demow();
		o.method();
		o.method(6);
	}
}
