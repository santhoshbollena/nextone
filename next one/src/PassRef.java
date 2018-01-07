
public class PassRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bad obj1=new Bad();
		Bad obj2;
		obj2=obj1;
		obj1.a=1;
		
		meth(obj2);
		System.out.println(obj1.a);
	}
	static void meth(Bad o)
	{
		o.a=o.a+1;
	}

}
class Bad{
	int a,b;
}
