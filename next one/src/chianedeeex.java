
public class chianedeeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			meth();
		}
		catch(ArithmeticException r)
		{
			System.out.println("caught "+r);
			System.out.println("caught"+r.getCause());
		}

	}
	static void meth() throws ArithmeticException
	{
		ArithmeticException r=new ArithmeticException();
		r.initCause(new ArithmeticException("message") );
		throw r;
		
	}

}
