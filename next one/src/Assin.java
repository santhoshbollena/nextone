
public class Assin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1=new B();
		B obj2;
		obj1.a=1;
		obj1.b=1;
		obj2=obj1;
		obj2.a=20;
		System.out.println(obj1.a);

	}

}
class B
{
	int a,b;
	
}
