
public class Stsic {
	static int x;
	public Stsic() {
		// TODO Auto-generated constructor stub
		x=x+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		Stsic obj=new Stsic();
		System.out.println(x);
		Stsic obj1=new Stsic();
		System.out.println(Stsic.x);
		Stsic obj2=new Stsic();
		
		int y=obj2.x;
		System.out.println(y);
	}

}
