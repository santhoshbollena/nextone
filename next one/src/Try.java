
public class Try extends Object {
	public static void main(String args[]) 
	{
		if(true)
		{
			
		}else if(true)
		{
			
		}
	
		
		try
		{
			
			throw new ArithmeticException();
		}
		catch(Exception ae)
		{
			System.out.println("caught");
		}
		
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("normal ");
	}

}

