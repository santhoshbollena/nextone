class base
{
	base()
	{
		System.out.println("base()");
	}
	base(int x)
	{
		System.out.println(x+"base (int");
	}
}
class derived extends base
{
	derived()
	{
		
		System.out.println("derived()");
	}
	derived(int x)
	{
		super();
	
		System.out.println(x+"derived(int");
	}
	
}
public class Demo123 {
public static void main(String args[])
{
	StringBuilder s=new StringBuilder("san");
	
	s.toUpperCase();
	System.out.println(s);
	s+="thosh";
	System.out.println(s);
	derived obj=new derived(4);
	switch(1)
	{
	case 1:
		System.out.println("zero");
	}
}
}

