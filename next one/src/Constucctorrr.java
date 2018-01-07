
public class Constucctorrr {
		String name;
		public Constucctorrr(String name) {
			// TODO Auto-generated constructor stub
			this.name=name;
		}
		public Constucctorrr() {
			// TODO Auto-generated constructor stub
			this(meth());
		}
		static String  meth()
		{
			String name=new String("santh");
			System.out.println("santttt");
			int x=(int)(Math.random()*5);
			System.out.println(x);
			String nam=new String[]{"san","kum","th","ost","as"}[x];
			return nam;
		}
	public static void main(String args[])
	{
		Constucctorrr obj=new Constucctorrr();
		System.out.println(obj.name);
		Constucctorrr obj2=new Constucctorrr("kumar");
		//System.out.println(obj2.name);
	}
}
