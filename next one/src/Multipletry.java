
public class Multipletry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=0;
			int b=9;
			b=b/a;
			try
			{
				int d=0;
				d=b/a;
			}
			catch(ArithmeticException r)
			{
				System.out.println("exception nested");
			}
		}
		catch(ArithmeticException r)
		{
			System.out.println("exception normal");
		}

	}

}
