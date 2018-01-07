
public class FinellyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method1();
			method2();
			method3();
		}
		catch(Exception r)
		{
			System.out.println("caught "+r);
		}

	}
	static void method1()
	{
		try
		{
			System.out.println("try in meth1");
		}
		finally
		{
			System.out.println("finally in meth1");
		}
	}
	static void method2()
	{
		try
		{
			System.out.println("try in meth2");
			return;
			
		}
		finally
		{
			System.out.println("finally in meth2");
		}
	}
	static void method3()
	{
		try
		{
			System.out.println("try in meth3");
			throw new ArithmeticException();
		}
		finally
		{
			System.out.println("finally in meth3");
		}
	}

}
