
public class Go {
	public static void main(String args[])
	{
		Go obj=new Go();
		go();
	}
	Go()
	{
		System.out.println("2 constructor ");
	}
	{
		System.out.println(" 3anonamus");
		go();
	}
	static 
	{
		System.out.println("1 static");
		
	}
	
	static void go()
	{
		System.out.println(" static method");
	}
	
}
