class baba
{
	{
		System.out.println("normal braces in baba");
	}
	baba()
	{
		System.out.println("constructor in baba");
	}
	static
	{
		System.out.println("static in baba");
	}
	
}
class Dada extends baba
{
	{
		System.out.println("normal in dada");
	}
	Dada()
	{
		System.out.println("constructor in dada");
	}
	static 
	{
		System.out.println("static in dada");
	}
	
}
public class Sci {
	public static void main(String args[])
	{
		new Dada();
	}
}
