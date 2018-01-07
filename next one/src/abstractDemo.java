abstract class Demo1111
{
	public static void write()
	{
		System.out.println("write");
	}
}
class p extends Demo1111
{
	public static void write()
	{
		System.out.println("writing");
	}
}
public class abstractDemo extends p{
	public static void write()
	{
		System.out.println("writingcode");
	}
	public static void main(String args[])
	{
		Demo1111 r=new abstractDemo();
		r.write();
	}
}
