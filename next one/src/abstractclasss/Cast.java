package abstractclasss;
class B
{
	void method()
	{
		System.out.println("method b");
	}
}
class D extends B
{
	void method()
	{
		System.out.println("method d");
	}
	void method(int t)
	{
		System.out.println("method int d");
	}
}
public class Cast {
	public static void main(String args[])
	{
		B obj=new D();
		B o=new D();
		((D) o).method(4);
	
		obj.method();
		
	}

}
