
public class Tete {
	public static void main(String args[])
	{
		{
		
			System.out.println("normal braces");
		}
		
		{
			DDD obj=new DDD();
			DDD o=new DDD();
		}
	}

}
class DDD
{
	DDD()
	{
		System.out.println("DDD()");
	}
	{
		System.out.println("normal 1 in ddd");
	}
	static 
	{
		System.out.println("ststic in DDD");
	}
	{
		System.out.println("normal inDDD");
	}
}
