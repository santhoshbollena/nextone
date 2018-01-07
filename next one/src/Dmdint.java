interface in1
{
	void me1();
}

class Demo implements in1
{
	public void me1()
	{
		System.out.println("me1()Demo");
	}
	
}
class Demo2 extends Demo implements in1
{
	public void me1()
	{
		System.out.println("me1()Demo2");
	}
}
public class Dmdint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 o=new Demo2();
		Demo obj=new Demo();
		method(obj);
		method(o);
	}
	public static void method(Demo o)
	{
		o.me1();
	}

}
