
public class Chainedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArithmeticException r=new ArithmeticException("by zero");
			r.initCause(new ArithmeticException("could not read"));
			throw r;
		}
		catch(Exception r)
		{
			System.out.println("exception caught "+r);
			System.out.println("caught "+r.getCause());
		}

	}

}
