import java.util.Random;
class EvenOddException extends Exception
{
	String Cause;
	EvenOddException() {
		Cause ="";
	}
	EvenOddException(String s)
	{
		Cause=s;
	}
	public String toString()
	{
		return Cause;
	}
	
}
public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		while(true)
		{
			int n=r.nextInt(0);
			if(n==0)
			{
				break;
			}
			try
			{
				if(n%2==0)
				{
					throw new EvenOddException("number even");
				}
				else 
					throw new EvenOddException("odd");
			}
			catch(EvenOddException e)
			{
				System.out.println("caught"+e.toString());
			}
		}
	}

}

