class Cbv
{
	void Cb(int i)
	{
		i+=2;
	}
}
class Cbr
{
	int i=10;
	void Cr(Cbr obj)
	{
		obj.i+=2;
	}
	void disp()
	{
		System.out.println("Cbr i="+i);
	}
}
public class CbvCbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Cbv obj1=new Cbv();
		obj1.Cb(i);
		System.out.println("i="+i);
		Cbr obj2=new Cbr();
		obj2.Cr(obj2);
		obj2.disp();
	}

}
