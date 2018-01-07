class Bb
{
	Bb()
	{
		this("sa");
		System.out.println("Bb()");
	}
	Bb(String s)
	{
		
		System.out.println("Bb(string)");
	}
}
class Dd extends Bb
{
	Dd()
	{
		
		this("sas");
		System.out.println("dd()");
		
	}
	Dd(String s)
	{
	
		System.out.println("Dd(string");
	}
}
public class Consnns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dd obj=new Dd();
	}

}
