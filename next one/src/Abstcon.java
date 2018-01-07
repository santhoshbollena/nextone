
abstract class J
{
	J()
	{
		System.out.println("j(");
	}
}
class F extends J
{
	int a;
	 F()
	{
		System.out.println("F(");
		
	}
	private F( int x)
	{
		System.out.println("private");
	}
	 void me()
	{
	F a=new F(6);
	
	}
	// void F()
	// {
		 
	// }
}
class Y{
	void meth()
	{}
		Y()
		{
			System.out.println("y{");
		}
		
	

	private void Y() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstcon {
	public static void main(String args[])
	{
		F obj=new F();
		obj.me();
	}

}
